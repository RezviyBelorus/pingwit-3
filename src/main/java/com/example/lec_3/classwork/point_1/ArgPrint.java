package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArgPrint {
    public static void main(String[] arg){
        for (String elem : arg){
            System.out.println(elem);
        }
        int x_1 = 33;
        int x_2 = 45;
        int x_3 = 55;
        int x_5 = 55;
        int[] arrayX = new int[]{33, 45, 55, 55};
        System.out.println(Arrays.toString(arrayX));
    }
}
