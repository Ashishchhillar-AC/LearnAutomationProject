package com.example.ex_25oct2024_Labprogram;

public class lab122 {
    public static void main(String[] args) {
        String s1="Hello My Dear Friend";
        String s4="Hello";
        String s2=new String("Hello");
        String s3=new String("Hello");
        s1=s1.toLowerCase();
        s1=s1.getBytes().toString();
        System.out.println(s1);
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.length());

    }
}
