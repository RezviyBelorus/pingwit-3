package pingwit.lec_3.classwork.point_1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] arg){
        int[] arrayToSort = {4, 3, 4, 1};
        boolean needToSort = true;
        while (needToSort){
            needToSort = false;
            for (int i = 1; i < arrayToSort.length; i++) {
             if (arrayToSort[i - 1] > arrayToSort[i]) {
                //swap-> меняем местами
                int tmp = arrayToSort[i - 1];
                arrayToSort[i - 1] = arrayToSort[i];
                arrayToSort[i] = tmp;
                needToSort = true;
                }
            }
            System.out.println(Arrays.toString(arrayToSort));
        }
        System.out.println("Final result" );
        System.out.println(Arrays.toString(arrayToSort));
    }

}
