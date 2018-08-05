package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public class Cat extends Animal {


    @Override
    void name(String name) {
        super.name(name);
    }

    @Override
    void voice() {
        System.out.println("Голос: мяу");
    }

    @Override
    void runSize(double runSize) {

        if (runSize > 200.0)
            System.out.println(name + " не может пробежать больше 200 м");
        else if (runSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (runSize == 0)
            System.out.println(name + " стоит на месте");
        else System.out.println(name + " пробежал " + runSize + " м");
    }

    @Override
    void swimSize(double swimSize) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    void jampSize(double jampSize) {
        if (jampSize > 2.0)
            System.out.println(name + " не может прыгнуть выше 2 м");
        else if (jampSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (jampSize == 0)
            System.out.println(name + " не прыгнул");
        else System.out.println(name + " прыгнул на " + jampSize + " м");
    }
}


