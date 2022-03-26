package pingwit.lec_4.classwork.point_1;

public class StudentMain {
    public static void main(String[] arg){
        Student alex = new Student(25,18,"Alex",true);
        Student randomStudent = new Student();


       System.out.println(alex.name);
        System.out.println(alex.id);
       System.out.println(alex.age);
       System.out.println(alex.male);

        System.out.println(randomStudent.name);
        System.out.println(randomStudent.id);
        System.out.println(randomStudent.age);
        System.out.println(randomStudent.male);
    }
}
