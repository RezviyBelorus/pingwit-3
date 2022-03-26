package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] arg){
        int[][] array2d = new int[5][4];
       // System.out.println(Arrays.toString(array2d));

        for (int i = 0; i< array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = j;
            }
        }
        for (int i = 0; i< array2d.length; i++){
             System.out.println(Arrays.toString(array2d[i]));
    }
    System.out.println("String array:");
    String[][] names = {{"Egorka", "Ольга", "Semen"},
            {"Molodec","Uletela","Nado Prodat"}
    };  // String[] names = new String[]

    for (int i =0; i < names.length; i++){
        System.out.println(Arrays.toString(names[i]));
    }
}
}

