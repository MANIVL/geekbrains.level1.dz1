package ru.geekbrains.java1.makerov.nikolai.dz.dz1;

public class Main {

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения

    byte b = 12;
    short s = -12569;
    int i = 5936214;
    long l = 59848452344896262L;
    float f = 865.896F;
    double d = 145.4412396;
    char c = 'N';
    boolean bool = true;


    public static void main(String[] args) {


        System.out.println(calculate(20, 47, 18, 6));
        System.out.println(ask10and20(15, 6));
        isPositiveOrNegative(3);
        System.out.println(isNegative(-15));
        greetings("Николай");


    }

    /* 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода*/

    public static int calculate(int a, int b, int c, int d) {

        int abcd = a * (b + (c / d));
        return abcd;


    }

    /*4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false */

    public static boolean ask10and20(int x1, int x2) {

        if (x1 + x2 >= 10 && x1 + x2 <= 20) {
            return true;
        } else return false;

    }

    /*5. Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
    ноль считаем положительным числом.*/

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("x - положительное число и равно" + " " + x);
        } else {
            System.out.println("x - отрицательное число и равно" + " " + x);
        }
    }

    /*6. Написать метод, которому в качестве параметра передается целое число, метод должен
     вернуть true, если число отрицательное*/

    public static boolean isNegative(int x) {

        if (x < 0) {
            return true;
        } else
            return false;
    }

    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     метод должен вывести в консоль сообщение «Привет, указанное_имя!»*/

    public static void greetings(String name) {

        System.out.println("Привет," + " " + name + "!");
    }




}







