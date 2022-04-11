package com.example.les_9.classwork.point_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FrMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/java/com/example/les_9/practice/task.txt")) {

            String encoding = fr.getEncoding();
            System.out.println(encoding);
            int n;
            while ((n = fr.read()) != -1) {
                System.out.print((char) n);
            }
        } catch (Exception e) {
        }
    }
}