package src.study.design.pattern.model;

import src.study.design.pattern.strategy.PlayStrategy;


public class Player {

    private PlayStrategy playStrategy;


    public Player(PlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    public void play() {
        playStrategy.play();
    }
}