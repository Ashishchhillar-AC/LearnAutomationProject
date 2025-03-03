package com.example.ex_29oct2024_Arrayprogram;

import java.util.Arrays;

public class lab125 {
    public static void main(String[] args) {
        int[] a={10,70,90,40,50};
        System.out.println("The length of array is "   +a.length);
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        System.out.println("----------------");

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
