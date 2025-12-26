package org.example;

public class Lesson8_Practice {
    public static void main(String[] args) {
        //Задача 1
        //Дан массив целых чисел. Напишите программу, которая вычисляет сумму всех положительных элементов массива.

        int[] number = {-3, 5, -1, 8, 0, 2, 16, 90, 16, 90};//целочисленный массив
        int sum = 0;//отвечает за сумму

        // поменять все отрицательные числа на 1
        for (int i = 0; i < number.length; i++) {//проходим по всем значениям массива
            if (number[i] < 0) {// number[i] = 5 8 2
                number[i] = 1;
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        int[] number1 = {-3, 5, -1, 8, 0, 2, 16, 90, 16, 90};
        for (int num : number1) {//num = -3 5 -1 8 0 2 16 90 16 90
            if (num < 0) {//
                num = 1;
            }
        }
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i] + " ");
        }
        System.out.println();


        System.out.println("Сумма положительных чисел в массиве равна " + sum);


        //Задача 2
        //Дан двумерный массив целых чисел (матрица). Напишите программу, которая вычисляет сумму всех его элементов.
        int sum2 = 0;
        int[][] arrayTwo = {
                {0, 232, 0, 0, 5},// arrayTwo[0]
                {3, 4, 0, 0, 5},//arrayTwo[1]
                {2, 8, 1, 0, 3},//arrayTwo[2]
                {1, 9, 1, 1, 6}};//arrayTwo[3]

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                sum2 = sum2 + arrayTwo[i][j];
            }
        }
        System.out.print(sum2);
    }
}
