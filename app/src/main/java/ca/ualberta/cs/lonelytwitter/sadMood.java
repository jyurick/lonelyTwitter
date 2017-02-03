package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class extends mood and sets mood description to "sad".
 */

public class sadMood extends Mood {

    /**
     * Constructor for sadMood sets MoodDescription to "sad"
     */
    public sadMood() {
        this.setMoodDescription("sad");
    }

    /**
     * Constructor for sadMood sets MoodDescription to "sad"
     * @param date passed to super Mood
     */
    public sadMood(Date date) {
        super(date);
        this.setMoodDescription("sad");

    }

    /**
     * Returns a string representing the mood description.
     * @return String representing the mood description.
     */
    public String returnMood () {
        return new String(this.getMoodDescription() + " :(");
    }
}
