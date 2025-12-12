package main.model;

import java.awt.Color;

import main.behavior.BehaviorStrategy;
import main.behavior.FlockBehavior;

public enum BoidType {
    STANDARD(Color.WHITE, new FlockBehavior());

    private final Color color;
    private final BehaviorStrategy behavior;
    

    BoidType(Color color, BehaviorStrategy behavior) {
        this.color = color;
        this.behavior = behavior;
    }

    public BehaviorStrategy getBehaviorStrategy() {
        return behavior;
    }

    

    public Color getColor() {
        return color;
    }
}