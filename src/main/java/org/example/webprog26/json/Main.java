package org.example.webprog26.json;

public class Main {

    private static final String SAMPLE_MESSAGE = "sender: Alex, text: Hi! How are you!";

    private static final String SAMPLE_MESSAGE_JSON = "{\n" +
            "  \"message\": {\n" +
            "    \"from\": \"Alex\",\n" +
            "    \"messageContent\": \"Hi! How are you?\"\n" +
            "  }\n" +
            "}";

    private static final String SAMPLE_MESSAGE_JSON_WITH_TIME = "{\n" +
            "  \"message\": {\n" +
            "    \"from\": \"Alex\",\n" +
            "    \"messageContent\": \"Hi! How are you?\",\n" +
            "    \"timeSentInMillis\": 1707403979420\n" +
            "  }\n" +
            "}";


    public static void main(String[] args) {
        final MessagePrinter messagePrinter = new MessagePrinter();
        final MessageListener messageListener = new MessageListenerImpl(messagePrinter);

//        final MessageAdapter stringMessageAdapter = new StringMessageAdapter();
//        final Message newMessage = stringMessageAdapter.convertToMessage(SAMPLE_MESSAGE);

        final MessageAdapter jsonMessageAdapter = new JsonMessageAdapter();
        final Message newMessage = jsonMessageAdapter.convertToMessage(SAMPLE_MESSAGE_JSON_WITH_TIME);
//
        messageListener.onMessageReceived(newMessage);
    }

}
