package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public abstract class Animal {


    protected String name ;


    void name(String name) {
        this.name = name;
        System.out.println("Имя: " + name);

    }

    abstract void voice();
    abstract void runSize(double runSize);
    abstract void swimSize(double swimSize);
    abstract void jampSize(double jampSize);

}
