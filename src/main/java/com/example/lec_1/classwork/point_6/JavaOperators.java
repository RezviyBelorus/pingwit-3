package pingwit.lec_1.classwork.point_6;

public class JavaOperators {
    public static void main(String[] arg){
        byte myInt_1 = 127;
        byte myInt_2 = 127;
        int sum = myInt_1+myInt_2;
        int sumAges = 33 + (2*3 +28);

        System.out.println(myInt_1  + myInt_2);
        System.out.println(sum);
        System.out.println(sumAges);

        System.out.println("3/5=" + 3/5);
        System.out.println("3/5=" + 3/5.0);
        System.out.println("3<5=" + (3<5));
        System.out.println("3==5->" + (3==5));
        System.out.println("3!=5->" + (3!=5));

         int x = 0;
        System.out.println("x =" + x);
        x = x + 1;
        System.out.println("x =" + x);
        x +=1;
        System.out.println("x =" + x);
        x++;
        ++x;

        System.out.println("x =" + x);
        System.out.println("x =" + ++x);
        System.out.println("x =" + x);

        System.out.println(8.24 + 4.8);

        System.out.println("8<<3=" + (8<<3));
        System.out.println("8>>2=" + (8>>2));
        System.out.println("8%5=" + 8 % 5);


    }
}
