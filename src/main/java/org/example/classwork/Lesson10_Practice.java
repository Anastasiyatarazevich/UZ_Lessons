package org.example.classwork;

import java.util.Scanner;

public class Lesson10_Practice {
    //int n1, n2;
    public static void main(String[] args) {
//Задача 2. Приветствие по имени
//
//Условие:
//Напишите метод greet, который принимает имя (строку) и выводит приветствие в формате:
//Привет, [имя]!
//Метод ничего не возвращает (void).
//В main запросите имя у пользователя и вызовите метод greet.
        System.out.println("Введите свое имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        greet(name);
        System.out.println(makeGreet(name));
        String newName = makeGreet(name);
        System.out.println(newName);
        System.out.println(newName);
        System.out.println(newName);

    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "1");
    }

    static String makeGreet(String name) {
        return "Привет, " + name + "2";
    }
//        System.out.println("Введите два целых числа");
//        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int s = sum(n1, n2);
//
//        if(n1 != 0)
//            return;
//        System.out.println("Сумма равна: " + s);
//
//        return;
//    }
//
//
//    static int sum(int num1, int num2){
//        return num1 + num2;
//    }
//
//    int method1(){
//        return 1;
//    }
//
//    void method2(){
//       method1();
//    }
//

}


// Задача 1. Сумма двух чисел
//
//Условие:
//Напишите метод sum, который принимает два целых числа и возвращает их сумму.
//В методе main запросите у пользователя два числа, вызовите метод sum и выведите результат.


//Задача 2. Приветствие по имени
//
//Условие:
//Напишите метод greet, который принимает имя (строку) и выводит приветствие в формате:
//Привет, [имя]!
//Метод ничего не возвращает (void).
//В main запросите имя у пользователя и вызовите метод greet.

