package com.example.les_9.classwork.point_9;

import java.io.Serializable;

public class Person implements Serializable {
    private  static  final long serialVersionUID =1621275799845232241L;
   private String name;
   private transient String surname;
   private Integer age;

   public Person(String egorka, String pupkin, int i, Work javist){

   }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}


