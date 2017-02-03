package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class extends Tweet class.
 */

public class importantTweet extends Tweet {
    /**
     * Constructor for importTweet
     * @param date to be passed to superclass Tweet
     * @param message to be passed to superclass Tweet
     * @throws TweetTooLongException when message is too long
     */
    public importantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Constructor for importTweet
     * @param message to be passed to superclass Tweet
     * @throws TweetTooLongException when message is too long
     */
    public importantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     *
     * @return Boolean representing whether the tweet is an Important tweet, returns True
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     *
     * @return String representing tweet message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + "!!!!";
    }
}
