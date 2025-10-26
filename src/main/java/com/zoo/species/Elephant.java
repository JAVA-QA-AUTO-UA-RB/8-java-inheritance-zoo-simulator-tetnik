package com.zoo.species;

import com.zoo.animals.Playable_I;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal implements Playable_I {

    public Elephant(String name, int energyLevel, String furColor) {
        super(name, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба! 🐘");
    }

    @Override
    public void eat() {
        changeEnergy(25);
    }

    @Override
    public void sleep() {
        changeEnergy(30);
    }

    @Override
    public void move() {
        System.out.println("Elephant stomps heavily.");
    }

    @Override
    public void play() {
        makeSound();
        changeEnergy(-25);
    }

    public void spraySelf() {
        System.out.println(getName() + " sprays water");
    }
}


