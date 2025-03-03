package com.example.ex_24oct2024_Labprogram;

import java.util.Scanner;



public class lab117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int a= sc.nextInt();
        System.out.println("enter the num2");
        int b=sc.nextInt();

        int result = sum_of_two_number(a,b);
        System.out.println("The sum of the integers  ="  +result);
        int result1 = Difference_of_numbers(a,b);
        System.out.println("The difference of numbers is  ="  +result1);
    }
    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static int Difference_of_numbers(int a, int b){
        return a-b;
    }
}
