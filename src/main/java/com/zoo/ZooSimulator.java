package com.zoo;

import com.zoo.species.*;
import com.zoo.zookeeper.ZooKeeper;
import com.zoo.animals.Animal;
import com.zoo.animals.Playable_I;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {

        System.out.println("Старт симуляції зоопарку");

        System.out.println("Створення тварин...");

        Lion King = new Lion("Сімба", 5,  "рудий");
        Elephant Elephant = new Elephant("Хатхі", 13,  "сірий");
        Eagle Eagle = new Eagle("Ітан", 3, 6.0);
        Penguin Penguin = new Penguin("Ковальський", 4,  0.6);

        List<Animal> animals = new ArrayList<>();
        animals.add(King);
        animals.add(Elephant);
        animals.add(Eagle);
        animals.add(Penguin);

        System.out.println("Створення доглядача...");
        ZooKeeper keeper = new ZooKeeper("Тетяна");


        System.out.println("Ранок:Початковий стан тварин");

        for (Animal animal : animals) {
            animal.displayInfo();
        }


        System.out.println("Годування тварин");

        for (Animal animal : animals) {
            keeper.feedAnimal(animal);
            keeper.checkAnimalEnergyLevel(animal);
        }

        System.out.println("Ігри та активності з тваринами");

        List<Playable_I> playables = new ArrayList<>();
        playables.add(King);
        playables.add(Elephant);
        playables.add(Eagle);
        playables.add(Penguin);

        for (Playable_I p : playables) {
            keeper.playWithAnimal(p);
        }

        System.out.println("Стан тварин наприкінці дня");

        for (Animal animal : animals) {
            keeper.checkAnimalEnergyLevel(animal);
            animal.makeSound();
        }

        System.out.println("Симуляція завершена");
       }

    }


















// Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.

        // Додайте логіку, яка представляє типові події дня в зоопарку:
        // - Годування тварин: використання методу feedAnimal().
        // - Гра з тваринами: використання методу playWithAnimal().
        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).

        // Виведіть фінальні результати та стани тварин наприкінці дня.
