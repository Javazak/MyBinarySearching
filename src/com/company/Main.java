package com.company;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Random;

public class Main {

    int SearchByBinary(int arr[] , int x){

        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int middle = low + (high-low)/2;
            if (arr[middle]==x){
                return middle;

            }
            if (arr[middle]<x){
                low = middle+1;

            }
            else {
                high = middle-1;
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int []array = {10,13,23,54,61,64,67,69};


        Main m = new Main();
        int res = m.SearchByBinary(array,69);
        System.out.println(res);



        Random random = new Random();
        int  a = random.nextInt(200);
//        System.out.println(a);


        MyBin myBin = new MyBin();
//        myBin.CreateArrayList();
}
}
