package com.example.ex15oct;

public class Lab15octTask1 {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        int c=9;
        int result =(a>=b && b>=c) ? a :(b>=c ? b:c);
        System.out.println("Largest number is " +result);
    }
}
