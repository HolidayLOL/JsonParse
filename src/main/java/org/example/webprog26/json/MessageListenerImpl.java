package org.example.webprog26.json;

public class MessageListenerImpl implements MessageListener {

    private final MessagePrinter messagePrinter;

    public MessageListenerImpl(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    @Override
    public void onMessageReceived(Message message) {
        messagePrinter.printMessage(message);
    }
}
