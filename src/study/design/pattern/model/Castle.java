package src.study.design.pattern.model;

import java.util.List;

public class Castle {

    private List<String> towers;
    private List<String> walls;

    public List<String> getTowers() {
        return towers;
    }

    public void setTowers(List<String> towers) {
        this.towers = towers;
    }

    public List<String> getWalls() {
        return walls;
    }

    public void setWalls(List<String> walls) {
        this.walls = walls;
    }
}