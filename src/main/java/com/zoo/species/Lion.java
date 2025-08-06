package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {

    public Lion(String name, int age, double weight, String furColor) {
        super(name, age, weight, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ричить: Рррр! 🦁");
    }

    public void hunt() {
        decreaseEnergy(25);
        System.out.println(name + " полює в савані.");
    }
}
