package com.example.ex_14oct2024;

public class Lab058typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
        System.out.println(s);
        System.out.println(phone_no);
    }
}
