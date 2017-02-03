package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class extends the Tweet class.
 */

public class normalTweet extends Tweet {
    /**
     * Constructor for normalTweet
     * @param date of tweet
     * @param message to be stored in Tweet
     * @throws TweetTooLongException when message is > 140 characters.
     */
    public normalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     *Costructor for normalTweet
     * @param message to be stored in Tweet
     * @throws TweetTooLongException when message is > 140 characters.
     */
    public normalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     *
     * @return Boolean representing whether the tweet is an Important tweet, returns False
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
