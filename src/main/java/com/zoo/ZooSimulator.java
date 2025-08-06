package com.zoo;

import com.zoo.species.*;
import com.zoo.zookeeper.ZooKeeper;
import com.zoo.animals.Animal;

public class ZooSimulator {

    public static void main(String[] args) {

        printSection("Старт симуляції зоопарку");

        print("Створення тварин...");

        Lion King = new Lion("Сімба", 5, 180.0, "рудий");
        Elephant Elephant = new Elephant("Хатхі", 13, 600.0, "сірий");
        Eagle Eagle = new Eagle("Ітан", 3, 6.0, 2.1);
        Penguin Penguin = new Penguin("Ковальський", 4, 15.0, 0.6);

        Animal[] animals = {King, Elephant, Eagle, Penguin};

        print("Створення доглядача...");
        ZooKeeper keeper = new ZooKeeper("Тетяна");

        printSection("Ранок:Початковий стан тварин");

        for (Animal animal : animals) {
            animal.displayInfo();
        }

        printSection("Годування тварин");

        for (Animal animal : animals) {
            keeper.feedAnimal(animal);
        }

        printSection("Ігри та активності з тваринами");

        keeper.playWithAnimal(King);
        King.hunt();
        King.groom();

        keeper.playWithAnimal(Elephant);
        Elephant.spraySelf();
        Elephant.groom();

        keeper.playWithAnimal(Eagle);
        Eagle.fly();

        keeper.playWithAnimal(Penguin);
        Penguin.fly();

        printSection("Перевірка енергії тварин після активностей");

        for (Animal animal : animals) {
            keeper.checkAnimalEnergyLevel(animal);
        }


        printSection("Вечір: Тварини відпочивають");

        for (Animal animal : animals) {
            animal.sleep();
        }

        printSection("Стан тварин наприкінці дня");

        for (Animal animal : animals) {
            animal.displayInfo();
        }

        printSection("Симуляція завершена");
    }

    private static void print(String message) {
        System.out.println("[ZooSimulator] " + message);
    }

    private static void printSection(String title) {
        System.out.println("\n==============================");
        System.out.println(title);
        System.out.println("==============================\n");
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
