package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.Playable_I;

public class Eagle extends Bird implements Playable_I {

    public Eagle(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Кріі-кріі! 🦅");
    }

    @Override
    public void eat() {
        changeEnergy(20);
    }

    @Override
    public void sleep() {
        changeEnergy(30);
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
        System.out.println(getName() + " is building a nest.");
    }

    @Override
    public void play() {
        makeSound();
        changeEnergy(-20);
    }
}

