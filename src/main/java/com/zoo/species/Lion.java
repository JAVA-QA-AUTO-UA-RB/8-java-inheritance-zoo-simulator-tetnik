package com.zoo.species;

import com.zoo.animals.Playable_I;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements Playable_I {

    public Lion(String name, int energyLevel, String furColor) {
        super(name, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Рррр! 🦁");
    }

    @Override
    public void eat() {
        changeEnergy(30);
    }

    @Override
    public void sleep() {
        changeEnergy(20);
    }

    @Override
    public void move() {
        System.out.println("Lion runs swiftly.");
    }

    @Override
    public void play() {
        makeSound();
        changeEnergy(-10);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting...");
        changeEnergy(-5);
    }
}

