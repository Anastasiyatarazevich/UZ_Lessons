package org.example.homework;

public class Lesson11_Homework {
     int a = 0;

    public static void main(String[] args) {

        // Задача 5. Найти второй по величине элемент в массиве
        //Тип метода: возвращает значение int
        //
        //📝 Условие:
        //Напишите метод  public static int findSecondLargest(int[] arr), который возвращает второй по величине
        // уникальный элемент в массиве целых чисел.
        //
        //Требования:
        // • Массив содержит минимум два элемента.
        // • Если все элементы равны — метод возвращает это же значение (например, для {5, 5, 5} → 5).
        //
        //В main создайте массив из 7 чисел (например, {10, 7, 9, 15, -5, 8, 3}) и вызовите метод.

        System.out.println("\nЗадача 5\n");

        int[] array = {50, 50, 30, 20};
        System.out.println("Второй по величине элемент : " + findSecondLargest(array));
    }

    void example(){
        a = 9;
    }

//    public static int findSecondLargest(int[] arr) {
//
//        int element = arr[0];
//        for (int i = 0; i < arr.length; i ++) {
//            if (element < arr[i]) {
//                element = arr[i];
//            }
//        }
//
//        int element2 = arr[0];
//        if (element == arr[0]) {
//            element2 = arr[1];
//        }
//        for (int i = 0; i < arr.length; i ++) {
//            if (element2 < arr[i] && arr[i] < element) {
//                element2 = arr[i];
//            }
//        }
//
//        return element2;
//    }

    public static int findSecondLargest(int[] arr) {
        //ищем максимум
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Найдём первый элемент, меньший max — он станет начальным secondMax
        int secondMax = max;
        boolean found = false;
        for (int num : arr) {
            if (num < max) {
                if (!found) {//условие для проверки находили ли мы до этого число меньше max
                    secondMax = num;
                    found = true;
                } else if (num > secondMax) { // условие проверки для ситуации, когда уже было найдено число меньше max
                    secondMax = num;
                }
            }
        }

        return secondMax;
    }
}
