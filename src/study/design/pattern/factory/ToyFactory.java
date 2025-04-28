package study.design.pattern.factory;

import study.design.pattern.model.Car;
import study.design.pattern.model.Doll;
import study.design.pattern.model.Robot;
import study.design.pattern.model.Toy;

public class ToyFactory {
    public Toy createToy(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Toy(new Car("car"));
            case "doll" -> new Toy(new Doll("doll"));
            case "robot" -> new Toy(new Robot("robot"));
            default -> throw new IllegalArgumentException("Unknown toy type: " + type);
        };
    }
}
