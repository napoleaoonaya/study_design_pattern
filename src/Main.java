package src;

import src.study.design.pattern.factory.ToyFactory;
import src.study.design.pattern.model.Player;
import src.study.design.pattern.model.Toy;
import src.study.design.pattern.service.impl.ToyServiceImpl;
import src.study.design.pattern.strategy.PlayStrategy;
import src.study.design.pattern.strategy.impl.RunFast;


public class Main {
    public static void main(String[] args) {

        ToyFactory factory = new ToyFactory();
        ToyServiceImpl toyService = new ToyServiceImpl();

        Toy car = factory.createToy("car");
        System.out.println("Created toy: " + car.getName());
        toyService.toPlay(car.getName());

        Toy doll = factory.createToy("doll");
        System.out.println("Created toy: " + doll.getName());
        toyService.toPlay(doll.getName());

        Toy robot = factory.createToy("robot");
        System.out.println("Created toy: " + robot.getName());
        toyService.toPlay(robot.getName());

        PlayStrategy playStrategy = new RunFast();
        Player player = new Player(playStrategy);
        player.play();
    }
}