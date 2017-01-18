package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 */

public class happyMood extends Mood {
    public happyMood() {
        this.setMoodDescription("happy");
    }

    public happyMood(Date date) {
        super(date);
        this.setMoodDescription("happy");

    }

    public String returnMood() {
        return new String(this.getMoodDescription() + " :)");
    }
}
