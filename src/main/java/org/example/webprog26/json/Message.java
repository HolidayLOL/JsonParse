package org.example.webprog26.json;

public class Message {

    private final User sender;
    private final String text;

    private final long timeSentInMillis;

    public Message(User sender, String text, long timeSentInMillis) {
        this.sender = sender;
        this.text = text;
        this.timeSentInMillis = timeSentInMillis;
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public long getTimeSentInMillis() {
        return timeSentInMillis;
    }
}
