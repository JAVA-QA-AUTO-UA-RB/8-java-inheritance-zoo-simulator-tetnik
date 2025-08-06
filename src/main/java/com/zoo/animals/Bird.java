package com.zoo.animals;

public abstract class Bird extends Animal {

    protected double wingSpan; // у метрах

    public Bird(String name, int age, double weight, double wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " цвірінькає.");
    }

    public void fly() {
        decreaseEnergy(15);
        System.out.println(name + " летить. Розмах крил: " + wingSpan + " м.");
    }

    public double getWingSpan() {
        return wingSpan;
    }
}
