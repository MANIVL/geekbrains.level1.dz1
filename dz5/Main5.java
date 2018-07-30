package ru.geekbrains.java1.makerov.nikolai.dz.dz5;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        menu();
        start();

    }

    public static void menu() {

        System.out.println("База данных сотрудников:");
        System.out.println();
        System.out.println("1. Николай");
        System.out.println("2. Маргарита");
        System.out.println("3. Дмитрий");
        System.out.println("4. Ирина");
        System.out.println("5. Василий");
        System.out.println("6. Полный список сотрудников");
        System.out.println("7. Список сотрудников старше 40 лет");
        System.out.println();
        System.out.println("0. Выход");
    }

    public static void start() {

        Workers[] pers = new Workers[5];
        pers[0] = new Workers("Николай", "Cпециалист по ТО", "nikolay@gmail.com", "8-911-205-68-94", 100000, 32);
        pers[1] = new Workers("Наталья", "Старший менеджер", "natalia@gmail.com", "8-911-456-84-71", 75000, 29);
        pers[2] = new Workers("Дмитрий", "Водитель", "dmitry@gmail.com", "8-921-125-14-89", 45000, 42);
        pers[3] = new Workers("Марина", "Бухгалтер", "marina@gmail.com", "8-921-859-12-36", 50000, 52);
        pers[4] = new Workers("Василий", "Менеджер", "vasiliy@gmail.com", "8-965-343-28-91", 60000, 25);

        System.out.println();
        System.out.println("Введите команду: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        do {

            if (num == 1) {
                pers[0].printInfo();
            } else if (num == 2) {
                pers[1].printInfo();
            } else if (num == 3) {
                pers[2].printInfo();
            } else if (num == 4) {
                pers[3].printInfo();
            } else if (num == 5) {
                pers[4].printInfo();
            } else if (num == 6) {
                for (int i = 0; i < 5; i++)
                    pers[i].printInfo();
            } else if (num == 7) {
                for (int i = 0; i < 5; i++)
                    pers[i].printOld();
            } else if (num < 0 || num > 7)
                System.out.println("Введите корректную команду.");


        } while (num < 0 && num > 7);
        if (num == 0)
            System.out.println("Работа программы завершена.");
        else start();


    }


}











