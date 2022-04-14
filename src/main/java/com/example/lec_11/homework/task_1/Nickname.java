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

// лишний абзац 
        System.out.print("Вспомни детскую кликуху: ");
        String yournickname; // yournickname -> yourNickname - новые слова с большой буквы
        Scanner name = new Scanner(System.in);
        yournickname = name.nextLine(); // String yournickname = name.nextLine(); - в одну строчку лучше в данном ситуации

        if (nickname.contains(yournickname)) {
            System.out.println(" Заходи дружище " + (yournickname));
        } else {
            System.out.println(" Вспоминай.... или проваливай!!! " + (yournickname));
        }
    }
}

