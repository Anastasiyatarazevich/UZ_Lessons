package org.example;

import java.util.Random;
import java.util.Scanner;

public class Lesson6_Practice {
    public static void main(String[] args) {
//Задача 2 — Вывод степеней двойки до n
//Пользователь вводит целое положительное число n.
//Программа выводит все степени двойки (1, 2, 4, 8, 16, ...), не превышающие n.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int res1;
//        int num1 = 0;
//        while (true) {
//            res1 = (int) Math.pow(2, num1);
//            if (res1 > n) {
//                break;
//            }
//            num1++; // num1 = num1 + 1
//            System.out.println(res1);
//        }
//
//        System.out.println();


//Задача 3 — Угадай число (угадывает пользователь)
//Компьютер «загадывает» число от 1 до 10 (можно зафиксировать, например, 7).
//Пользователь вводит свои попытки, пока не угадает.
//После каждой попытки программа говорит:
// • "Больше", если загаданное число больше введённого,
// • "Меньше", если меньше,
// • "Угадал!" — при совпадении.

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        Random random = new Random();
//        int number = 1 + random.nextInt(10);// от 0 до 10 от 1 до 11
//        while (true) {
////            n = s.nextInt();
//            if (n < number) {
//                System.out.println("Больше");
//            } else if (n > number) {
//                System.out.println("Меньше");
//            } else {
//                break;
//            }
//            n = s.nextInt();
//        }
//        System.out.println("Угадал");

//Задача 4* — Подсчёт количества цифр в числе
//Пользователь вводит целое положительное число.
//Программа должна вывести, сколько цифр в этом числе.


        //1234/10=123/10=12/10=1/10=0
        //674/10=67/10=6/10=0
        //90/10=9/10=0
        //7/10=0

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите свое положительное число");
//        long number = scanner.nextLong();
//
//        if (number == 0) {
//            System.out.println("Количество цифр 1");
//        } else {
//            int count = 0; // number==124
//            while (number != 0) {
//                count++; //1 2 3
////            number = number / 10;
//                number /= 10; //12 1 0
//            }
//            System.out.println("Количество цифр " + count);
//        }

//        int i = 1;
//        while(i <= 5){
//            System.out.println(i);
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        long factorial = 1;
//        // n == 5
//        for (int i = 1; i <= n; i++) { //1 2 3 4 5
//            factorial *= i; // 1*2*3*4*5
//        }
//
//        System.out.println(n + "! = " + factorial);


        // Задача 1 - Вывод квадратов чисел
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int num1 = 1; num1 <= N; num1++) {
            int res1 = num1 * num1;
            System.out.println(num1 + "²=" + res1);
        }

        // Задача 2 - Обратный отсчёт

        int n = sc.nextInt();
        for (int num2 = n; num2 >= 1; num2-=2) {// num2 = num2 - 2
            System.out.println(num2);
        }
        System.out.println("Пуск!");
    }
}
//n! = 1 * 2 * 3 *...* n
//5! = 1 * 2 * 3 * 4 * 5
//6! = 1 * 2 * 3 * 4 * 5 * 6