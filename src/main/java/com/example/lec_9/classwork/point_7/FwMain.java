package com.example.les_9.classwork.point_7;

import java.io.FileReader;
import java.io.FileWriter;

public class FwMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/com/example/les_9/classwork/point_7/file.txt")) {

            String message = "Hello from method Main";
            fw.write(message);
            fw.flush();
        } catch (Exception e) {
        }
    }
}
