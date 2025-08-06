package com.zoo.animals;

public abstract class Animal {

    // 🔒 protected — доступ для нащадків
    protected String name;
    protected int age;
    protected double weight;

    // 🔐 private — тільки всередині класу
    private int energyLevel;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = 50; // базове значення
    }

    public void eat() {
        energyLevel = Math.min(100, energyLevel + 20);
        System.out.println(name + " їсть. 🔋 Енергія: " + energyLevel);
    }

    public void sleep() {
        energyLevel = Math.min(100, energyLevel + 30);
        System.out.println(name + " спить. 💤 Енергія: " + energyLevel);
    }

    public void makeSound() {
        System.out.println(name + " видає загальний звук.");
    }

    public void displayInfo() {
        System.out.println("🐾 Ім’я: " + name +
                ", Вік: " + age +
                ", Вага: " + weight +
                " кг, Енергія: " + energyLevel);
    }

    // ✅ Геттери
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    // 👇 Для дочірніх класів, які зменшують енергію
    protected void decreaseEnergy(int amount) {
        energyLevel = Math.max(0, energyLevel - amount);
        System.out.println(name + " втрачає " + amount + " енергії. 🔋 Поточна: " + energyLevel);
    }
}

