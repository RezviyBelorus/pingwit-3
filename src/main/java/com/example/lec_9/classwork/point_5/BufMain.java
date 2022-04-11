package com.example.les_9.classwork.point_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class BufMain {
    private static final String FILE_PATH ="src/main/java/com/example/les_9/practice/task.txt";
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(FILE_PATH);
            BufferedInputStream buff =new BufferedInputStream(fis)
        ){
            byte[] bytes = new byte[2048];

            int n;
            while ((n = buff.read(bytes)) != -1){
              System.out.println("n = " + n);
              System.out.println(Arrays.toString(bytes));
            }
            System.out.println(n);
            System.out.println(Arrays.toString(bytes));
            System.out.println(bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
