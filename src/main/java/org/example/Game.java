package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //Todo: реализовать таймер

        //Инициализация всех значений
        String person = "\uD83E\uDDD9\u200D";
        int personLive = 3;

        String monster = "\uD83E\uDDDF\u200D";
        String castle = "\uD83C\uDFF0";
        int sizeBoard = 5;
        int personX = 1;
        int personY = sizeBoard;


        int step = 0;
        String leftBlock = "| ";
        String rightBlock = "|";
        String wall = "+ —— + —— + —— + —— + —— + ";
//        String gamingField = "+ —— + —— + —— +\n"
//                + "|    |    | \uD83C\uDFE0 |\n"
//                + "+ —— + —— + —— +\n"
//                + "|    | " + monster + " |    |\n"
//                + "+ —— + —— + —— +\n"
//                + "| " + person + " |    |    |\n"
//                + "+ —— + —— + —— +";

        //Создание пустого поля при помощи массива
        String[][] board = new String[sizeBoard][sizeBoard];
        for (int y = 0; y < sizeBoard; y++) {// строки
            for (int x = 0; x < sizeBoard; x++) {// столбцам
                board[y][x] = "  ";
            }
        }


        //Определяем количество монстров
        int countMonster = sizeBoard * sizeBoard - sizeBoard - 1;
        Random r = new Random();
        for (int i = 0; i <= countMonster; i++) {
            board[r.nextInt(sizeBoard - 1)][r.nextInt(sizeBoard)] = monster;
        }

        //Определяем координаты замка
        int castleX = r.nextInt(sizeBoard);
        int castleY = 0;


        //Размещаем замок на поле
        board[castleY][castleX] = castle;

        //Приветственные слова для игрока
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("Ваш ответ:\t" + answer);


        switch (answer) {
            case "ДА" -> {
                //Указываем сложность игры (нам это необходимо по ТЗ)
                System.out.println("Выбери сложность игры(от 1 до 5):");
                int difficultGame = sc.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);

                int maxStep = 2;

                while (true) {
                    //Размещаем персонажа на поле
                    board[personY - 1][personX - 1] = person;

                    //Отрисовываем поле
                    for (String[] raw : board) {
                        System.out.println(wall); //Для каждой строки отрисовываем сначала + —— + —— + —— +
                        for (String col : raw) {
                            System.out.print(leftBlock + col + " "); //Для каждого столбца отрисовываем | и значение ячейки
                        }
                        System.out.println(rightBlock); //Заканчиваем отрисовку строки
                    }
                    System.out.println(wall); //Закрываем нижнюю часть таблицы

                    System.out.println("Количество жизней:\t" + personLive + "\n");

                    System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;" +
                            "\nКоординаты персонажа - (x: " + personX + ", y: " + personY + "))");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + ", " + y);

                    // Проверка правильности хода игрока
                    if (x != personX && y != personY) {// Случай равенства хода изначальным координатам игрока
                        System.out.println("Неккоректный ход");
                    } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {// Если пользователь передвинулся на одну ячейку в любую из сторон
                        if (board[y - 1][x - 1].equals("  ")) {// Обрабатываем случай с пустой ячейкой
                            board[personY - 1][personX - 1] = "  ";// Очищаем ячейку на которой до этого стоял герой
                            // Обновляем координаты героя
                            personX = x;
                            personY = y;
                            step++;
                            System.out.println("Ход корректный; Новые координаты: " + personX + ", " + personY +
                                    "\nХод номер: " + step);
                        } else if (board[y - 1][x - 1].equals(castle)) {// Обрабатываем случай с замком
                            System.out.println("Вы прошли игру!");
                            break;
                        } else {
                            System.out.println("Решите задачу.");// Обрабатываем случай с монстром (доработаем в следующих встречах)
                        }
                    } else {
                        System.out.println("Координаты не изменены");
                    }

                    if (personLive <= 0) {// Если жизни закончились, то выходим из цикла
                        break;
                    }
                }

                System.out.println("Закончились жизни. Итог: ...");
            }
            case "НЕТ" -> System.out.println("Жаль, приходи еще!");
            default -> System.out.println("Данные введены неккоректно");
        }

    }
}
