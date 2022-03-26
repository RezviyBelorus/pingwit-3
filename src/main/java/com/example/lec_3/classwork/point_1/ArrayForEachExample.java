package pingwit.lec_3.classwork.point_1;

public class ArrayForEachExample {
    public static void main(String[] arg){
        String[] names = {"Egorka", "Ольга", "Semen"};
        int[] nambers = {1,2,5};
        for (int i = 0; i < names.length; i = i + 2) {
            System.out.println(names[i]);
        }
        for (int elem : nambers){
            System.out.println(elem);
        }
    }
}
