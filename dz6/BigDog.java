package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public class BigDog extends Dog {


    @Override
    void name(String name) {
        super.name(name);
    }

    @Override
    void voice() {
        System.out.println("Голос: вуф");
    }

    @Override
    void runSize(double runSize) {
        if (runSize > 400)
            System.out.println(name + " не может пробежать больше 400 м");
        else if (runSize < 0)
            System.out.println("Это значение не может быть отрицательным");
        else if (runSize == 0)
            System.out.println(name + " стоит на месте");
        else System.out.println(name + " пробежал " + runSize + " м");
    }

    @Override
    void swimSize(double swimSize) {
        super.swimSize(swimSize);
    }

    @Override
    void jampSize(double jampSize) {
        super.jampSize(jampSize);
    }
}
