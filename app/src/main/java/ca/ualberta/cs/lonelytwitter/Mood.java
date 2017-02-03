package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Abstract class representing the mood of a tweet with a String as well as the date
 * that the mood is set.
 */

public abstract class Mood {
    private Date date;
    private String moodDescription;

    /**
     * Constructor for Mood Class
     * @param date that will ultimately passed to superclass Tweet
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Constructor for Mood Class
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Returns a string describing the mood of the tweet.
     * @return String describing the mood of the tweet.
     */
    public String getMoodDescription() {
        return moodDescription;
    }

    /**
     *
     * @param moodDescription String representing moodDescription. "happy" or "sad"
     */
    public void setMoodDescription(String moodDescription) {
        this.moodDescription = moodDescription;
    }

    /**
     *
     * @return date of Mood
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date of Mood
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return String representing moodDescription
     */
    public abstract String returnMood();
}
