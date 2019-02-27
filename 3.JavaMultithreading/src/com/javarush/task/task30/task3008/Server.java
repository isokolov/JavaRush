package com.javarush.task.task30.task3008;

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
