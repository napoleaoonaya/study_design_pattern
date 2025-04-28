package src.study.design.pattern.observer.impl;

import src.study.design.pattern.observer.MessageObserver;

public class MessageServiceImpl implements MessageObserver {
    @Override
    public void update(String message) {
        System.out.println("Received message: " + message);
    }
}
