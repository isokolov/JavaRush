package com.javarush.task.task30.task3008;

import com.javarush.task.task30.task3008.client.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        try {
            for(Map.Entry<String, Connection> entry: connectionMap.entrySet()) {
                entry.getValue().send(message);
            }
        } catch (IOException exc) {
            ConsoleHelper.writeMessage("Couldn't send the message.");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            if (connectionMap.containsKey(userName)) {
                return;
            }
            for (Map.Entry<String, Connection> entry: connectionMap.entrySet()) {
                String userToInform = entry.getKey();
                connection.send(new Message(MessageType.USER_ADDED, userToInform));

            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            Message response;
            String userName;

            do {
                connection.send(new Message(MessageType.NAME_REQUEST));
                response = connection.receive();
                userName = response.getData();
            } while (response.getType() != MessageType.USER_NAME || userName.isEmpty() || connectionMap.containsKey(userName));

            connectionMap.put(userName, connection);
            connection.send(new Message(MessageType.NAME_ACCEPTED));

            return userName;
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            Message message;
            String result = "";
            while (true) {
                message = connection.receive();
                result = message.getData();
                if(message.getType() == MessageType.TEXT) {
                    result = userName + ": " + result;
                    sendBroadcastMessage(new Message(MessageType.TEXT, result));
                }
                if(message.getType() != MessageType.TEXT) {
                    ConsoleHelper.writeMessage("Wrong message type");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage(socket.getRemoteSocketAddress().toString());
            try {
                Connection connection = new Connection(socket);
                String userName = serverHandshake(connection);
                Server.sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                Server.sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                ConsoleHelper.writeMessage("Connection closed");
            } catch (IOException e) {
                //e.printStackTrace();
                ConsoleHelper.writeMessage("Error by working with " + socket.getRemoteSocketAddress());
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
                ConsoleHelper.writeMessage("Error by working with " + socket.getRemoteSocketAddress());
            }
        }
    }

    public static void main(String[] args) {

        int portNumber = ConsoleHelper.readInt();
            try (ServerSocket serverSocket = new ServerSocket(portNumber);){
                ConsoleHelper.writeMessage("Server is running!");
                //Socket clientSocket = serverSocket.accept();
                while (true) {
                    Handler handler = new Handler(serverSocket.accept());
                    handler.start();


                }
            } catch (IOException exc) {
                ConsoleHelper.writeMessage("Connection error!");
            }
    }
}
