package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class extends mood and sets mood desccription to "happy".
 */

public class happyMood extends Mood {
    /**
     * Constructor for happyMood Class. Sets MoodDescription to "happy"
     */
    public happyMood() {
        this.setMoodDescription("happy");
    }

    /**
     * Constructor for happyMood Class. Sets MoodDescription to "happy"
     * @param date to be passed as param to super class Tweet's constructor
     */
    public happyMood(Date date) {
        super(date);
        this.setMoodDescription("happy");

    }

    /**
     * Returns string representing the mood description.
     * @return String representing the Mood Description.
     */
    public String returnMood() {
        return new String(this.getMoodDescription() + " :)");
    }
}
