package org.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String person = "Гг";
        int personLive = 3;

        String monster = "\uD83E\uDDDF\u200D";
        int sizeBoard = 3;
        int personX = 1;
        int personY = 3;
        int step = 0;

        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    | \uD83C\uDFE0 |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";

        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
//        System.out.print("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)\n");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("Ваш ответ:\t" + answer);

        if (answer.equals("Да")) {
            System.out.println(gamingField);
            System.out.println("Хорошей игры!");
        } else if (answer.equals("дА")){
            System.out.println(gamingField);
            System.out.println("Хорошей игры!");
        } else if (answer.equals("ДА")){
            System.out.println(gamingField);
            System.out.println("Хорошей игры!");
        } else if (answer.equals("да")){
            System.out.println(gamingField);
            System.out.println("Хорошей игры!");
        } else {
            System.out.println("Ты не хочешь с нами играть:(");
        }
    }
}
