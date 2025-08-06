package com.zoo.zookeeper;

import com.zoo.animals.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
        animal.eat();
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " plays with " + animal.getName());
        animal.makeSound();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String level;
        if (energy <= 30) {
            level = "Низький";
        } else if (energy <= 70) {
            level = "Середній";
        } else {
            level = "Високий";
        }
        System.out.println(animal.getName() + " має рівень енергії: " + level + " (" + energy + ")");
    }
}
