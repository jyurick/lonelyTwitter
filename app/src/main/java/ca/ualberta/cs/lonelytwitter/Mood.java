package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 */

public abstract class Mood {
    private Date date;
    private String moodDescription;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    public String getMoodDescription() {
        return moodDescription;
    }

    public void setMoodDescription(String moodDescription) {
        this.moodDescription = moodDescription;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String returnMood();
}
