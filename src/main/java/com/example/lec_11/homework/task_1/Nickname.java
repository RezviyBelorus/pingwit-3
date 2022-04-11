package com.example.lec_11.homework.task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Nickname {
    public static void main(String[] args) {
// не отрабатывает некорректно введенные пробелы  и цифры
        ArrayList<String> nickname = new ArrayList<>();

        nickname.add("Фига");
        nickname.add("Лома");
        nickname.add("Щавлик");
        nickname.add("Пончик");


        System.out.print("Вспомни детскую кликуху: ");
        String yournickname;
        Scanner name = new Scanner(System.in);
        yournickname = name.nextLine();

        if (nickname.contains(yournickname)) {
            System.out.println(" Заходи дружище " + (yournickname));
        } else {
            System.out.println(" Вспоминай.... или проваливай!!! " + (yournickname));
        }
    }
}

