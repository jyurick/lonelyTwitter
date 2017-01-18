package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 */

public class normalTweet extends Tweet {
    public normalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public normalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
