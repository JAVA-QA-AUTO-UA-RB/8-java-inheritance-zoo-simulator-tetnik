package com.zoo.zookeeper;

import com.zoo.animals.Animal;
import com.zoo.animals.Eatable_I;
import com.zoo.animals.Playable_I;

public class ZooKeeper {

    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Eatable_I animal) {
        animal.eat();
        System.out.println(name + " fed " + ((Animal) animal).getName() + ".");
    }

    public void playWithAnimal(Playable_I animal) {
        animal.play();
        System.out.println(name + " played with " + ((Animal) animal).getName() + ".");
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String status = (energy <= 30) ? "Low"
                : (energy <= 70) ? "Medium"
                : "High";

        System.out.println(animal.getName() + " energy level: " + status + " (" + energy + ")");
    }
}

