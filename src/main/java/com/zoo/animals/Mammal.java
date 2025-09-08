package com.zoo.animals;

public abstract class Mammal extends Animal {

    protected String furColor;

    public Mammal(String name, int energyLevel, String furColor) {
        super(name, energyLevel);
        this.furColor = furColor;
    }

    public abstract void move();
}


