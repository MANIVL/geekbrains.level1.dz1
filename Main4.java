package ru.geekbrains.java1.makerov.nikolai.dz.dz4;


import java.util.Random;
import java.util.Scanner;

public class Main4 {
    private static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {

        System.out.print("  ");

        for (int i = 0; i <= SIZE; i++) {
            if (i > 0)
                System.out.print(i + " ");
        }
        System.out.print("- X");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("|\nY");
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isCheckWin('X')) {
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break;

            aiTurn();
            printMap();
            if (isCheckWin('O')) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean isCheckWin(char c) {

        int a;
        int b;
        int a1 = 0;
        int b1 = 0;

        for (int i = 0; i <= SIZE - 1; i++) {
            b = 0;
            a = 0;
            for (int j = 0; j <= SIZE - 1; j++) {

                if (map[i][j] == c) {
                    b++;
                    if (b == SIZE) return true;
                }


                if (map[j][i] == c) {
                    a++;
                    if (a == SIZE) return true;
                }
            }


            if (map[i][i] == c) {
                a1++;
                if (a1 == SIZE) return true;
            } else a1 = 0;


            if (map[i][SIZE - 1 - i] == c) {
                b1++;
                if (b1 == SIZE) return true;
            } else b1 = 0;
        }
        return false;
    }


    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х");
            x = sc.nextInt() - 1;
            System.out.println("Введите координаты в формате У");
            y = sc.nextInt() - 1;


        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_O;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;

    }


}