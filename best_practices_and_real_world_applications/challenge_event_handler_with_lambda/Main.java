package com.example;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> messageHandler = message -> System.out.println("Notification: New message received - " + message);

        handleNewMessage("Hello, you have a new message!", messageHandler);
    }

    public static void handleNewMessage(String message, Consumer<String> onMessage) {
        onMessage.accept(message);
    }
}
