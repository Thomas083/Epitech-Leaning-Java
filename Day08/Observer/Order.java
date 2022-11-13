package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {
    private String position, destination;
    private int timeBeforeArrival;
    private List<Observer> observers;

    public Order() {
        observers = new ArrayList<Observer>();
    }

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }

    public void setData(String position, String destination, int timeBeforeArrival) {
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean notifyObservers() {
        if(observers == null) {
            return false;
        } else {
            for(Observer observer : observers) {
                observer.update(this);
            }
            return true;
        }
    }
}
