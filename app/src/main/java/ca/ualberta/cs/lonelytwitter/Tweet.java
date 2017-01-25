package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //current time and date
    }

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

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
