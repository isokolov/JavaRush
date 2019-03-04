package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.*;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected Connection connection;
    private volatile boolean clientConnected = false;

    public class SocketThread extends Thread {

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (!clientConnected) {
                //if (connection.receive().getType() == MessageType.NAME_REQUEST) {
                    Message message = connection.receive();
                    if (message.getType() == MessageType.NAME_REQUEST) {
                        connection.send(new Message(MessageType.USER_NAME, getUserName()));

                        //Message messageAccept = connection.receive();
                    }
                    else if (message.getType() == MessageType.NAME_ACCEPTED) {
                        notifyConnectionStatusChanged(true);
                        break;
                    }
                    else// (message.getType() != MessageType.NAME_ACCEPTED && message.getType() != MessageType.NAME_REQUEST) {
                        throw new IOException("Unexpected MessageType");
                    //}
                //}
            }

        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while(true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    processIncomingMessage(message.getData());
                } else if (message.getType() == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(message.getData());
                } else if (message.getType() == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(message.getData());
                } else throw new IOException("Unexpected MessageType");
                
            }
        }

        public void run() {
            String serverAddress = getServerAddress();
            int port = getServerPort();
            try {
                Socket socket = new Socket(serverAddress, port);
                /*Connection clientConnection*/ connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException e) {
                //e.printStackTrace();
                notifyConnectionStatusChanged(false);
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
                notifyConnectionStatusChanged(false);
            }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("участник с именем " + userName + " подключился к чату.");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("участник с именем " + userName + " покинул чат.");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            //connection.getRemoteSocketAddress().
            synchronized (Client.this) {
                Client.this.clientConnected = clientConnected;
                Client.this.notify();
            }

        }
    }

    protected String getServerAddress() {
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException exc) {

            ConsoleHelper.writeMessage("No connection established");
            clientConnected = false;
        }
    }

    public void run() {
        SocketThread clientSocket = getSocketThread();
        clientSocket.setDaemon(true);
        clientSocket.start();
        String text = "";
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Произошла ошибка");
            clientConnected = false;
        }

        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
        }
        if (!clientConnected) {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
        while (clientConnected) {
            text = ConsoleHelper.readString();
            if (text.equals("exit")) break;
            if (shouldSendTextFromConsole()) {
                sendTextMessage(text);
            }
        }

    }
}
