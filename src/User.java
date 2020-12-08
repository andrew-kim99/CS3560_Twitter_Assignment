
//this class extends the abstract class Subject and 
//sets the String tweet to the tweet that was recently
//posted by a user. This follows the Observer Design Pattern.
public class User extends Subject {
    private String tweet;
    private Long time;

    public User() {
        //
    }

    public String getTweet() {
        return this.tweet;
    }

    public Long getTime() {
        return this.time;
    }

    // When this tweet is set, it also calls the notifyObservers()
    // method included in the Subject class that updates all observers
    // with this class
    public void setTweet(String tweet, Long time) {
        this.tweet = tweet;
        this.time = time;
        notifyObservers();
    }

}
