package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public Eagle(String name, int age, double weight, double wingSpan) {
        super(name, age, weight, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кричить: Кріі-кріі! 🦅");
    }

    @Override
    public void fly() {
        decreaseEnergy(20);
        System.out.println(name + " летить високо в небі.");
    }
}
