package src.study.design.pattern.builder;

import src.study.design.pattern.model.Castle;

import java.util.ArrayList;
import java.util.List;

public class CastleBuilder {

    private List<String> towers = new ArrayList<>();
    private List<String> walls = new ArrayList<>();

    public CastleBuilder addTower(String tower) {
        this.towers.add(tower);
        return this;
    }

    public CastleBuilder addWall(String wall) {
        this.walls.add(wall);
        return this;
    }

    public Castle build() {
        Castle castle = new Castle();
        castle.setTowers(towers);
        castle.setWalls(walls);
        return castle;
    }
}