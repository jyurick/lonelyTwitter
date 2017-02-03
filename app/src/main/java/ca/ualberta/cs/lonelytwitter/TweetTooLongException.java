package ca.ualberta.cs.lonelytwitter;

/**
 * Exception used in Tweet class. This exception is meant to be thrown when the
 * Tweet message is too long (over 140 characters).
 */

public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
