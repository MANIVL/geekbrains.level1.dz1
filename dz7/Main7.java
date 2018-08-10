package ru.geekbrains.java1.makerov.nikolai.dz.dz7;

public class Main7 {

    public static void main(String[] args) {

        Cat[] cats = {

                new Cat("Барсик", 15),
                new Cat("Васька", 25),
                new Cat("Толстый", 40),
                new Cat("Мурзик", 8),
                new Cat("Гав", 1)

        };


        Plate plate = new Plate(50);


        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }

        plate.info();
        plate.addFood(39);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
        plate.info();

    }
}
