package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 *
 * Tweet class is a super class that implements Tweetable.
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Constructor for Tweet class
     * @param date
     * @param message
     * @throws TweetTooLongException when message is > 140 characters.
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    /**
     * Constructor for Tweet class. Date of Tweet is set to current date and time.
     * @param message
     * @throws TweetTooLongException when message is > 140 characters.
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //current time and date
    }

    /**
     *
     * @param String representing the mood to be added. Moods available are "happy" and "sad"
     */
    public void addMood (String mood) {
        if (mood.equals("happy")) {
            this.moodList.add(new happyMood());
        }
        else if (mood.equals("sad")) {
            this.moodList.add(new sadMood());
        }
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            //todo throw new error here
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *
     * @return String representing Tweet with user friendly formatting.
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
