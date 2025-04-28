package src;

import src.study.design.pattern.adapter.SquareSocket;
import src.study.design.pattern.adapter.impl.SocketAdapterImpl;
import src.study.design.pattern.builder.CastleBuilder;
import src.study.design.pattern.factory.ToyFactory;
import src.study.design.pattern.model.*;
import src.study.design.pattern.observer.MessageObserver;
import src.study.design.pattern.observer.impl.MessageServiceImpl;
import src.study.design.pattern.prototype.impl.Picture;
import src.study.design.pattern.service.impl.ToyServiceImpl;
import src.study.design.pattern.singleton.SuperBallSigleton;
import src.study.design.pattern.strategy.PlayStrategy;
import src.study.design.pattern.strategy.impl.PassBall;
import src.study.design.pattern.strategy.impl.RunFast;


public class Main {
    public static void main(String[] args) {

        System.out.println("Design Pattern Example Factory");

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

        System.out.println("\nDesign Pattern Example Strategy");

        PlayStrategy playStrategyOne = new RunFast();
        Player playerOne = new Player(playStrategyOne);
        playerOne.play();

        PlayStrategy playStrategyTwo = new PassBall();
        Player playerTwo = new Player(playStrategyTwo);
        playerTwo.play();

        System.out.println("\nDesign Pattern Example Observer");

        InBox inBox = new InBox();

        MessageObserver observer = new MessageServiceImpl();
        inBox.addObserver(observer);

        inBox.notifyObservers("Hello 1!");
        inBox.notifyObservers("Hello 2!");

        System.out.println("\nDesign Pattern Example Builder");
        Castle castle = new CastleBuilder()
                .addTower("Tower 1")
                .addTower("Tower 2")
                .addWall("Wall 1")
                .addWall("Wall 2")
                .build();

        System.out.println("Castle built with walls: " + String.join(", ", castle.getWalls()));
        System.out.println("Castle built with towers: " + String.join(", ", castle.getTowers()));

        System.out.println("\nDesign Pattern Example Singleton");

        SuperBallSigleton superBall = SuperBallSigleton.getInstance();
        superBall.play();

        System.out.println("\nDesign Pattern Example Prototype");
        Picture service = new Picture("Castle");
        Picture originalPicture = new Picture(service.getName());
        Picture clonedPicture = originalPicture.clone();

        originalPicture.display();
        clonedPicture.display();

        System.out.println("\nDesign Pattern Example Adapter");
        RoundSocket roundSocket = new RoundSocket();
        SquareSocket squareSocket = new SocketAdapterImpl(roundSocket);

        squareSocket.squarePlugIn();

    }
}