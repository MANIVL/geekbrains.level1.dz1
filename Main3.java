package ru.geekbrains.java1.makerov.nikolai.dz.dz3;

/*1 Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

import java.util.Random;
import java.util.Scanner;

public class Main3 {


    public static void main(String[] args) {

        start();

    }

    public static void start() {

        System.out.println("Попробуй отгадать число от 0 до 9. У тебя три попытки. Удачи!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(10);
        int count = 0;
        int num;

        do {

            num = scanner.nextInt();

            if (num == a) {
                System.out.println("Поздравляю! Загаданное число - " + a);
                System.out.println("Может еще разок? 1 – да / 0 – нет");
                break;

            } else if (num > a & num <= 9) {
                System.out.println("Загаданное число меньше.");
                count++;
                System.out.println("Это была попытка № " + count);

            } else if (num < a & num >= 0) {
                System.out.println("Загаданное число больше.");
                count++;
                System.out.println("Это была попытка " + count);
            } else {
                System.out.println("Введи число в указанных пределах.");
                count++;
                System.out.println("Это была попытка " + count);
            }

            if (count == 3) {
                System.out.println("Ты проиграл. Может еще разок? 1 – да / 0 – нет");
                break;
            }

        } while (!(num == a) && count != 3);
        {

            do {

                num = scanner.nextInt();

                if (num == 1) {
                    start();
                }
                else if (num == 0) {
                    System.out.println("Ну, может в другой раз");
                    break;
                }
                else if (!((num == 1) && (num == 0)))
                    System.out.println("введи 1, или 0");


            }while (!((num == 1) && (num == 0)));


        }

    }
}








