package src.study.design.pattern.prototype.impl;

public class Picture implements Cloneable {

    private String name;

    public Picture(String name) {
        this.name = name;
    }

    public Picture(Picture copy) {
        this.name = copy.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Displaying picture: " + name);
    }

    @Override
    public Picture clone() {
        return new Picture(this.name);
    }
}