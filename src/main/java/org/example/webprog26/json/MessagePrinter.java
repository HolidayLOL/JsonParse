package org.example.webprog26.json;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MessagePrinter {

    public void printMessage(final Message message) {
       if (message != null) {
           System.out.println("From: " + message.getSender().getName() + " at: " + timeInMillisToReadableDate(message.getTimeSentInMillis()));
           System.out.println(message.getText());
       }
    }

    private String timeInMillisToReadableDate(long timeInMillis) {
        final Date date = new Date(timeInMillis);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm", Locale.getDefault());
        return simpleDateFormat.format(date);
    }
}
