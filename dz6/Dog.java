package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public class Dog extends Animal {

    @Override
    void name(String name) {
        super.name(name);
    }

    @Override
    void voice() {
        System.out.println("Голос: гав");
    }

    @Override
    void runSize(double runSize) {
        if (runSize > 500)
            System.out.println(name + " не может пробежать больше 500 м");
        else if (runSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (runSize == 0)
            System.out.println(name + " стоит на месте");
        else System.out.println(name + " пробежал " + runSize + " м");
    }

    @Override
    void swimSize(double swimSize) {
        if (swimSize > 10)
            System.out.println(name + " не может проплыть более 10 м");
        else if (swimSize < 0)
            System.out.println(name + " значение не может быть отрицательным");
        else if (swimSize == 0)
            System.out.println(name + " не плывёт");
        else System.out.println(name + " проплыл " + swimSize + " м");
    }

    @Override
    void jampSize(double jampSize) {
        if (jampSize > 0.5)
            System.out.println(name + " не может прыгнуть выше 0,5 м");
        else if (jampSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (jampSize == 0)
            System.out.println(name + " не прыгнула");
        else System.out.println(name + " прыгнул на " + jampSize + " м");
    }
}
