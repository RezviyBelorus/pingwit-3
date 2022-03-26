package pingwit.lec_3.classwork.point_1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Его имя, Сестра:  ");
        String name = scanner.next();
        System.out.println("Его возраст:  ");
        long age = scanner.nextLong();

        // scanner.next();
       // scanner.nextLong();
        System.out.println("Имя " + name);
        System.out.println("Возраст " + age);
    }
}