package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {

    public Elephant(String name, int age, double weight, String furColor) {
        super(name, age, weight, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубить: Труба-ба-ба! 🐘");
    }

    public void spraySelf() {
        System.out.println(name + " обливає себе водою з хобота. 💦");
    }
}

