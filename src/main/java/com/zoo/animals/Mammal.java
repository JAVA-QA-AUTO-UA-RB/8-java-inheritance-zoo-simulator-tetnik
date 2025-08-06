package com.zoo.animals;

public abstract class Mammal extends Animal {

    protected String furColor;

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " видає звук ссавця.");
    }

    public void groom() {
        System.out.println(name + " доглядає за своїм хутром (" + furColor + "). 🧼");
    }

    public String getFurColor() {
        return furColor;
    }
}

