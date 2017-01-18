package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jyurick on 1/17/17.
 */

public class sadMood extends Mood {


    public sadMood() {
        this.setMoodDescription("sad");
    }

    public sadMood(Date date) {
        super(date);
        this.setMoodDescription("sad");

    }

    public String returnMood () {
        return new String(this.getMoodDescription() + " :(");
    }
}
