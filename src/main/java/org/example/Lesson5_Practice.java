package org.example;

import java.util.Scanner;

import static java.lang.System.out;

public class Lesson5_Practice {
    public static void main(String[] args) {

        //Задача 5 — Выбор языка приветствия
        //Пользователь вводит код языка:
        // • "ru" → вывести "Привет!"
        // • "en" → вывести "Hello!"
        // • "es" → вывести "¡Hola!"
        // • "fr" → вывести "Bonjour!"
        // • Любой другой код → "Язык не поддерживается"

//        String language;
//        Scanner d = new Scanner(System.in);
//        language = d.nextLine();
//        switch (language) {
//            case ("ru"):
//                out.println("Привет");
//                break;
//            case ("en"):
//                out.println("Hello");
//                break;
//            case ("es"):
//                out.println("Hola");
//                break;
//            case ("fr"):
//                out.println("Bonjour");
//                break;
//            default:
//                out.println("Язык не подерживается");
//                break;
//        }

        //Задача: вывести все числа от 1 до 10
        // Пример решения задачи без цикла
//        out.println(1);
//        out.println(2);
//        out.println(3);
//        out.println(4);
//        out.println(5);
//        out.println(6);
//        out.println(7);
//        out.println(8);
//        out.println(9);
//        out.println(10);

        // Пример решения задачи с циклом

//        int a = 0;
//
//        while(a <= 10){//a == 10
//            a = a + 1; // a == 11
//            out.println(a); // a == 11
//        }
        // Вывод: цикл сокращает количество строк кода и делает программу понятнее


        //Задача: вывести все числа от 1 до n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 1;
//        while (a <= n) { // 1 2 3 4 5
//            System.out.println(a); // 1 2 3 4 5
//            a = a + 1; //2 3 4 5 6
//        }


        //Задача: вывести сумму всех чисел, которые ввел пользователь (при этом число 0 означает завершение программы)
        // 6
        // 7
        //9
        //10
        //0
        Scanner sc = new Scanner(System.in);
        int number = -1;
        int sum = 0;

        out.println("Введите числа (ввод 0 завершит программу)");

        while (number != 0) { // number: -1 6 7 9 10
            number = sc.nextInt();// number: 6 7 9 10 0
            if (number != 0) {
                sum += number; //sum: 6 13 22 32
            }
//            sum = sum + number;
        }
        out.println("Сумма чисел: " + sum);
    }
}
