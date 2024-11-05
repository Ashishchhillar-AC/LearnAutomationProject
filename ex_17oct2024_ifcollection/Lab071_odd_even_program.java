package com.example.ex_17oct2024_ifcollection;

import java.util.Scanner;

public class Lab071_odd_even_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
