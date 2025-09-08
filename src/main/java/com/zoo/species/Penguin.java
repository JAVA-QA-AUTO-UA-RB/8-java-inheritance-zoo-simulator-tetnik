package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.Playable_I;

public class Penguin extends Bird implements Playable_I {

    public Penguin(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря! 🐧");
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
        surfOnIce();
    }

    private void surfOnIce() {
        System.out.println(getName() + " is sliding on the ice 🧊");
    }

    @Override
    public void play() {
        makeSound();
        changeEnergy(-10);
    }
}


