package com.example.les_9.classwork.point_6;

import java.io.*;

public class DisMain {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("src/main/java/com/example/les_9/classwork/point_6_file");
             DataInputStream dos = new DataInputStream(fos)){
            boolean isTrue = dos.readBoolean();
            double myDouble =  dos.readDouble();

            System.out.println(isTrue);
            System.out.println(myDouble);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
