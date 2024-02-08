package org.example.webprog26.json;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonMessageAdapter implements MessageAdapter {

    private static final String TITLE_MESSAGE = "message";
    private static final String TITLE_FROM = "from";
    private static final String TITLE_TEXT = "messageContent";

    private static final String TITLE_TIME_SENT_IN_MILLIS = "timeSentInMillis";

    @Override
    public Message convertToMessage(String input) {
        try {
            final JSONObject jsonObject = new JSONObject(input);
//            System.out.println(jsonObject.toString());

            final JSONObject messageJsonObject = jsonObject.getJSONObject(TITLE_MESSAGE);

//            System.out.println(messageJsonObject);


            final User messageSender = new User(messageJsonObject.getString(TITLE_FROM));
            final String messageText = messageJsonObject.getString(TITLE_TEXT);
            final long timeSentInMillis = messageJsonObject.getLong(TITLE_TIME_SENT_IN_MILLIS);
            final Message newMessage = new Message(messageSender, messageText, timeSentInMillis);

//            System.out.println(messageJsonObject.getString(TITLE_FROM));
//            System.out.println(messageJsonObject.getString(TITLE_TEXT));


            return newMessage;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
