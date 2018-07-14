package ru.geekbrains.java1.makerov.nikolai.dz.dz1;

public class Main {

    // Задание 2

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
        leapYearOrNo(2400);

    }

    //  Задание 3

    public static int calculate(int a, int b, int c, int d) {

        int abcd = a * (b + (c / d));
        return abcd;


    }

    // Задание 4

    public static boolean ask10and20(int x1, int x2) {

        if (x1 + x2 >= 10 && x1 + x2 <= 20) {
            return true;
        } else return false;

    }

    // Задание 5

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("x - положительное число и равно" + " " + x);
        } else {
            System.out.println("x - отрицательное число и равно" + " " + x);
        }
    }

    // Задание 6

    public static boolean isNegative(int x) {

        if (x < 0) {
            return true;
        } else
            return false;
    }

    //  Задание 7

    public static void greetings(String name) {

        System.out.println("Привет," + " " + name + "!");
    }

    public static void leapYearOrNo(int year) {

            if (year % 4 == 0 && !(year % 100 == 0)) {   /*если остаток при делении на 4 равен 0 и остаток при
                                                          делении на 100 НЕ равен 0, то год високосный */
            System.out.println("Год "+year+" високосный");
            }
            else if (year % 400 == 0) System.out.println("Год "+year+" високосный"); /* иначе если остаток при делении на 400
                                                                                      раввен 0,то год високосный*/
            else System.out.println("Год "+year+" не високосный"); // иначе, год не високосный
    }
}











