package com.zoo.animals;

import com.zoo.animals.Eatable_I;
import com.zoo.animals.Sleepable_I;

public abstract class Animal implements Eatable_I,Sleepable_I {

    protected String name;

    private int energyLevel;

    public Animal(String name) {
        this(name, 50);
    }

    public Animal(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    protected void changeEnergy(int delta) {
        this.energyLevel += delta;
        if (this.energyLevel > 50) {
            this.energyLevel = 50;
        } else if (this.energyLevel < 0) {
            this.energyLevel = 0;
        }
    }

    public abstract void makeSound();

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Energy: " + energyLevel);
    }
}

