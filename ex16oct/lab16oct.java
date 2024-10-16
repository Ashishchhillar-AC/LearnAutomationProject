package com.example.ex16oct;

public class lab16oct {
    public static void main(String[] args) {
        //Create a program to check wheather Ashi will go to Goa or Not
        // Take a input age = ashu -> Goa
        // age >25 -> drinking- goa
        // ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int age = Integer.parseInt(args[1]);
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");

    }

}
