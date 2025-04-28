package src.study.design.pattern.model;

public class Toy {

    private String name;

    public Toy(Car car) {
        this.name = car.getName();
    }

    public Toy(Doll doll) {
        this.name = doll.getName();
    }

    public Toy(Robot robot) {
        this.name = robot.getName();
    }

    public String getName() {
        return name;
    }
}
