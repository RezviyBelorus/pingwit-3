package pingwit.lec_1.classwork.point_5;

public class TypeCasting {
    public static void main(String[] arg){
        byte myByte = 127;
        int myInt = 514;
        double myDouble = 33.9999;
        myInt = (int) myDouble;
        myDouble = myInt;

        System.out.println("myByte=" + myByte);
        System.out.println("myInt=" + myInt);
        System.out.println("myDouble=" + myDouble);
        System.out.println("myDouble=" + myDouble);

    }


}
