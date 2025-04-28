package src.study.design.pattern.strategy.impl;

import src.study.design.pattern.strategy.PlayStrategy;

public class RunFast implements PlayStrategy {
    @Override
    public void play() {
        System.out.println("Run fast");
    }
}