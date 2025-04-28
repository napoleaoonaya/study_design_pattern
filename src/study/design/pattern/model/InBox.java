package src.study.design.pattern.model;

import src.study.design.pattern.observer.MessageObserver;

import java.util.ArrayList;
import java.util.List;

public class InBox {
    private List<MessageObserver> observers = new ArrayList<>();

    public void addObserver(MessageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        System.out.println("New message in box:");
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }

}
