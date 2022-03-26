package pingwit.lec_4.classwork.point_3;

public class Animal {

   private String name;

    {
        System.out.println("ПРОДОЛЖАЮ Грызть!!! Нонстатик блок2");
    }
    {
        System.out.println("ПРОДОЛЖАЮ Грызть!!! Нонстатик блок");
    }


    static {
        System.out.println("Cтатик блок2");
    }

    static {
        System.out.println("Cтатик блок 1");
    }


    public Animal(String name) {
        this.name = name;
        System.out.println("грызу из конструктора");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}













