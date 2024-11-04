package com.example.ex_17oct2024_ifcollection;

import java.util.Scanner;

public class Lab072_if_elseif_else {
    public static void main(String[] args) {
        // Condition-2outputs,
        // Can we have two or more outputs?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no1");
        int no1= sc.nextInt();
        System.out.println("Enter the no2");
        int no2=sc.nextInt();
        if (no1>no2){
            System.out.println("No1>No2");
        } else if (no2>no1) {
            System.out.println("no2>no1");

        }else {
            System.out.println("equal");
        }
    }
}
