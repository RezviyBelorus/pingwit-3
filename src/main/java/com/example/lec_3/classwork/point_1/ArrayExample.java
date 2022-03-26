package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //     for (String elem : args) {
        //       System.out.println(elem);
        int[] cat = new int[5];
          String[] names = {"Egorka", "Ольга", "Semen"};  // String[] names = new String[]
        for (int i = 0; i < cat.length; i++) {
            cat[i] = i +2;
        }
          /*
            for (int i = 0; i <cat.length; i++) {
                System.out.println("cat[" +i +"] = " +cat[i]);
           }
          System.out.println(array[i]);

              }
          */
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(cat));
        System.out.println("After the cycle");
    }
}

