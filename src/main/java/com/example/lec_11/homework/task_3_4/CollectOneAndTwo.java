package com.example.lec_11.homework.task_3_4;

import java.util.ArrayList;

public class CollectOneAndTwo {
    public static void main(String[] args) {
        ArrayList collection1 =  new ArrayList();
        ArrayList collection2 = new ArrayList();

        collection1.removeAll(collection2); //удаляем из первой те,  кторые есть во второй
        collection1.retainAll(collection2); // оставляем в первой только те, которые есть во второй
      }
    }
