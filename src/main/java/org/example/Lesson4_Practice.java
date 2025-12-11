package org.example;

import java.util.Scanner;

public class Lesson4_Practice {
    public static void main(String[] args) {

        //Задача 1 — Определение чётности числа
        //Напишите программу, которая запрашивает у пользователя целое число и выводит:
        //•	"Чётное", если число делится на 2 без остатка;
        //•	"Нечётное" — в противном случае.
       /* byte num;
        Scanner brom = new Scanner(System.in);
        num = brom.nextByte();
        if (num % 2 == 0) {
            System.out.print("Четное");
        } else if (num % 2 == 1) {
            System.out.print("нечетное");
        }

        if (num % 2 == 0) {
            System.out.print("Четное");
        } else {
            System.out.print("нечетное");
        }*/

        //Задача 2 — Сравнение двух чисел
        //Пользователь вводит два целых числа. Программа должна вывести:
        //• "Первое больше", если первое число больше второго;
        //• "Второе больше", если второе больше первого;
        //• "Числа равны", если они одинаковы.

        int number1;
        int number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        number1 = in.nextInt();
        System.out.println("Введите второе число");
        number2 = in.nextInt();
        if(number1 > number2){
            System.out.println("Первое больше");
        } else if(number1 < number2){
            System.out.println("Второе больше");
        } else {
            System.out.println("Числа равны");
        }

        //3 / 2 = 1.5
        //Правило: деление целого на целое — целое, если что-то нецелое, то и результат будет не целым
//        int i = (7%3);// 7:3=2(ост 1)
//         i = (9%2);// 9:2=4(ост 1)
//         i = (10%2);// 10:2=5(ост 0)
//         i = (11%2);// 11:2=5(ост 1)
//         i = (12%2);// 12:2=6(ост 0)
//        System.out.println(i);//1.5 1


    }
}
