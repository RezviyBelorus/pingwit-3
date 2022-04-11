package com.example.lec_11.homework.task_7;

import java.util.TreeSet;


public class TreeSetTask7 {
    public static void main(String[] args) {
        TreeSet<Integer> treetask7 = new TreeSet<Integer>();
        TreeSet<Integer> reversetreetask7 = new TreeSet<Integer>();

        treetask7.add(14);
        treetask7.add(8);
        treetask7.add(5);
        treetask7.add(11);
        treetask7.add(55);
        treetask7.add(97);  // Добавляем данные

        System.out.println(treetask7);

        reversetreetask7 = (TreeSet) treetask7.descendingSet();// разворачиваем

        System.out.println(reversetreetask7);
    }
}
