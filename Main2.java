package ru.geekbrains.java1.makerov.nikolai.dz.dz2;



public class Main2 {

    public static void main(String[] args) {


        invertArray();
        fillArray();
        changeArray();


    }

    /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
       0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */



        public static void invertArray () {

            System.out.println();

            int[] arr = {1, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else arr[i] = 1;
                System.out.print(arr[i] + " ");

            }


        }

     /* 2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
    значениями 0 3 6 9 12 15 18 21 */


        public static void fillArray() {
            System.out.println();

            int[] arr = new int[8];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;

                System.out.print(arr[i] + " ");
            }
        }
    /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2 */

        public static void changeArray() {
            System.out.println();

            int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
             for (int i = 0; i < w.length; i++) {
                 if (w[i] < 6) {
                     w[i] = w[i] * 2;
            }
            System.out.print(w[i] + " ");
        }
    }


    }


















