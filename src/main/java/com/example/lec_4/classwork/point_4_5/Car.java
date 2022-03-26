package pingwit.lec_4.classwork.point_4_5;

public class Car {
    //private, package(default),protected, public

    private String produser;
    private String number;

    public Car(String produser, String number) {
        this.produser = produser;
        this.number = number;
    }

    public String toString() {
        return "Car{" +
                "produser='" + produser + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    protected String fullCarName() {
        return produser + "&" + number;

    }
}
