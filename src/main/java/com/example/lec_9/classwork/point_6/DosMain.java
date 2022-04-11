package com.example.les_9.classwork.point_6;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosMain {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/main/java/com/example/les_9/classwork/point_6_file");
            DataOutputStream dos = new DataOutputStream(fos)){
                dos.writeBoolean(true);
                dos.writeDouble(3.2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
