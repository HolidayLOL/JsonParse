package org.example.webprog26.json;

import org.json.JSONException;
import org.json.JSONObject;

public class StringMessageAdapter implements MessageAdapter {


    @Override
    public Message convertToMessage(String input) {
        final String[] splittedInput = input.split(",");

//        for (String item: splittedInput) {
//            System.out.println(item.trim());
//        }

        final String messageSender = splittedInput[0].substring(splittedInput[0].indexOf(" ")).trim();
        final String messageText = splittedInput[1].substring(splittedInput[1].indexOf(" ")).trim();

//        System.out.println(messageSender);
//        System.out.println(messageText);

        final User sender = new User(messageSender);
        return new Message(sender, messageText, System.currentTimeMillis());
    }
}
