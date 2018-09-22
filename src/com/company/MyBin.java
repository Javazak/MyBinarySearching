package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyBin {


    public void CreateArrayList(){
        int a;
        Random random = new Random();
        a= random.nextInt(40);
        int count = 200;


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            arrayList.add(count);
            count = count-10;
        }

        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
        System.out.println( Collections.binarySearch(arrayList,40));


    }




}
