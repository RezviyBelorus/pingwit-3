package com.example.les_9.classwork.point_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FisMain {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/main/java/com/example/les_9/practice/task.txt");
            int data;
            while ((data = fis.read()) != -1){
                System.out.print((char) data);
            }
         } catch (IOException o) {
          o.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
