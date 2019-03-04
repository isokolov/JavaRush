package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.*;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected Connection connection;
    private volatile boolean clientConnected = false;

    public class SocketThread extends Thread {}

    protected String getServerAddress() {
        //String serverAddress = ConsoleHelper.readString();
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
        //while (clientConnected) { // tried while (true)
            /*synchronized (this) { // tried synchronized(clientSocket)
                while (!clientConnected) {
                    try {
                        this.wait(); // tried clientSocket
                    } catch (InterruptedException e) {
                        ConsoleHelper.writeMessage("Ошибка ожидания соединения.");
                    }
                }
            }*/
            //this.notify();
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
        //}

    //}
    }
}
