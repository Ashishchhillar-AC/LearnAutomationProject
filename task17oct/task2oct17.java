package com.example.task17oct;

import java.util.Scanner;

public class task2oct17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        double s1=sc.nextDouble();
        System.out.println("Enter the length of side 2");
        double s2=sc.nextDouble();
        System.out.println("Enter the length of side 3");
        double s3=sc.nextDouble();
        if (s1<=0 || s2<=0 || s3<=0){
            System.out.println("Invalid input, Side lengths must be positive.");
        } else if (s1==s2 || s2==s3 ) {
            System.out.println("It is an Equilateral triangle");
        } else if (s1==s2 || s1==s3 || s2==s3) {
            System.out.println("It is a isosceles triangle");
        }else{
            System.out.println("it is a Scalene triangle");
        }
    }
}
