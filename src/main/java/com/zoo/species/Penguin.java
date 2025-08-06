package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {

    public Penguin(String name, int age, double weight, double wingSpan) {
        super(name, age, weight, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " каже: Кря-кря! 🐧");
    }

    @Override
    public void fly() {
        System.out.println(name + " не літає, але чудово плаває.");
        swim();
    }

    public void swim() {
        decreaseEnergy(10);
        System.out.println(name + " пливе у крижаній воді. 🏊");
    }
}

