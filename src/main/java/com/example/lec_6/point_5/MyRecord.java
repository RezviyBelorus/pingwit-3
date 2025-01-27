package com.example.lec_6.classwork.point_5;

import java.util.Objects;

public record MyRecord(String name) {
    private void sayHi(){
     System.out.println("Hello from Record");
    }

}

class  MyOldRecordClass {
   private String name;

    public MyOldRecordClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  //  public void setName(String name) {
  //      this.name = name;
 //   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOldRecordClass that = (MyOldRecordClass) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MyOldRecordClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
