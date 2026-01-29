package org.example.classwork;

import java.util.Scanner;

public class Lesson14_Practice {
//    static void sayHello() {
//        System.out.println("Привет!");
//    }
//
//    static int sum(int a, int b) {
//        return a + b;
//    }

    //Задача 1. Среднее арифметическое трёх чисел
    //
    //Условие:
    //Напишите метод average(double a, double b, double c), который принимает три числа и возвращает их среднее
    // арифметическое (сумма делённая на 3).
    //
    //В методе main запросите у пользователя три числа, вызовите метод и выведите результат.
    //

//    static double average(double a, double b, double c) {
//        double result = (a + b + c) / 3;
//        return result;
//    }

    //Задача 2. Таблица умножения
//
//Условие:
//Напишите метод printMultiplicationTable(int number), который принимает целое число и выводит таблицу умножения для этого числа от 1 до 10.
//
//Метод ничего не возвращает (void).
//
//В методе main запросите у пользователя число и вызовите метод.

    static void printMultiplicationTable(int number){
        for(int i = 1; i <= 10; i++){
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMultiplicationTable(n);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();

//        System.out.println(average(a, b, c));
    }
}
//        sayHello();
//        int s = sum(2, 3);
//        int finalPrice = s + 400 / 6;
//        System.out.println(s);
//        System.out.println(sum(4, 1));
//
//        s++;
//        int price = sum(4, 1);


