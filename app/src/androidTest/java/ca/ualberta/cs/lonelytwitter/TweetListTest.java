package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by jyurick on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("teste tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testAddTweetException() {
        TweetList copy = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet2 = new NormalTweet("test2");

        copy.addTweet(tweet);
        copy.addTweet(tweet);
        copy.delete(tweet);
        copy.addTweet(tweet2);

        assertEquals(copy.getTweet(0).getMessage(), "test2");
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another teste tweet");

        tweets.add(tweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());

    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("teste tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Calendar cal = Calendar.getInstance();

        cal.set(2017, 1, 1);
        Tweet tweet = new NormalTweet("1");
        tweet.setDate(cal.getTime());

        cal.set(2014,1,1);
        Tweet tweet2 = new NormalTweet("2");
        tweet2.setDate(cal.getTime());

        cal.set(2010,1,1);
        Tweet tweet3 = new NormalTweet("3");
        tweet3.setDate(cal.getTime());

        tweets.add(tweet2);
        tweets.add(tweet);
        tweets.add(tweet3);

        List<Tweet> sortedTweets = tweets.getTweets();

        for (int x = 0; x < sortedTweets.size() - 1 ; x++) {
            Tweet first = sortedTweets.get(x);
            Tweet second = sortedTweets.get(x+1);

            assertTrue(first.getDate().compareTo(second.getDate()) < 0);
        }
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("teste tweet");

        tweets.add(tweet);
        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }



}
