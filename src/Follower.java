import java.util.ArrayList;

//This class implements the Observer interface and 
//keeps an ArrayList of tweets of every user. This follows
//the Observer Design pattern.
public class Follower implements Observer {
    ArrayList<String> tweets = new ArrayList<String>();

    public ArrayList<String> getTweets() {
        return this.tweets;
    }

    public void setTweets(ArrayList<String> tweets) {
        this.tweets = tweets;
    }

    // The update method called from the Subject class
    // adds the recently tweeted message from the User class
    // and appends it to the tweets ArrayList in this class
    @Override
    public void update(Subject subject) {
        tweets.add(((User) subject).getTweet());
    }

}
