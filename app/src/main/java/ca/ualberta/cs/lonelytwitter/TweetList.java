package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jyurick on 2/14/17.
 */

public class TweetList{

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet (Tweet tweet) {
        for (int x = 0; x < tweets.size(); x++) {
            for (int y = 0; y < tweets.size(); y++) {
                if (y != x && tweets.get(x) == tweets.get(y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public static Comparator<Tweet> tweetDateComparator = new Comparator<Tweet>() {
        public int compare(Tweet tweet, Tweet t1) {
            return tweet.getDate().compareTo(t1.getDate());
        }
    };

    public List<Tweet> getTweets() {
        Collections.sort(tweets, tweetDateComparator);
        return tweets;
    }


}
