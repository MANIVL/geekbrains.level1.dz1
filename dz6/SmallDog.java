package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public class SmallDog extends Dog {

    @Override
    void name(String name) {
        super.name(name);
    }

    @Override
    void voice() {
        super.voice();
    }

    @Override
    void runSize(double runSize) {
        super.runSize(runSize);
    }

    @Override
    void swimSize(double swimSize) {
        super.swimSize(swimSize);
    }

    @Override
    void jampSize(double jampSize) {
        if (jampSize > 1.0)
            System.out.println(name + " не может прыгнуть выше 1,0 м");
        else if (jampSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (jampSize == 0)
            System.out.println(name + " не прыгнула");
        else System.out.println(name + " прыгнул на " + jampSize + " м");
    }
}
