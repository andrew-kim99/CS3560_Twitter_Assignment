
import java.util.ArrayList;

//This abstract class is extended by the User class to follow
//the Observer design pattern
public abstract class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public ArrayList<Observer> getObservers() {
        return this.observers;
    }

    // This method is in line with following another user, they are
    // basically subscribed to whoever they are observing
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // This method updates all observers with the updated User class
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
