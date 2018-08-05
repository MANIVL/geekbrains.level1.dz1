package ru.geekbrains.java1.makerov.nikolai.dz.dz6;

public class Main6 {


    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new BigDog();
        animals[3] = new SmallDog();



        System.out.println("-------------Кот--------------");

        animals[0].name("Сизый");
        animals[0].voice();
        animals[0].runSize(128.1);
        animals[0].swimSize(150);
        animals[0].jampSize(1.12);

        System.out.println("-----------Собака-------------");

        animals[1].name("Бобик");
        animals[1].voice();
        animals[1].runSize(310.38);
        animals[1].swimSize(6.24);
        animals[1].jampSize(0.5);


        System.out.println("--------Большая собака---------");

        animals[2].name("Тузик");
        animals[2].voice();
        animals[2].runSize(550.3);
        animals[2].swimSize(13.78);
        animals[2].jampSize(0.8);


        System.out.println("--------Маленькая собака--------");

        animals[3].name("Шарик");
        animals[3].voice();
        animals[3].runSize(420.47);
        animals[3].swimSize(8.91);
        animals[3].jampSize(0.76);


    }
}
