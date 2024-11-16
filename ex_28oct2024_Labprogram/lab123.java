package com.example.ex_28oct2024_Labprogram;

public class lab123 {
    public static void main(String[] args) {
        String anotherPalindrome ="Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);
        String s1="Ashish";
        String s2= s1.concat("Chhillar");
        System.out.println(s2);
        String fruits="Apple,Mango,Cherry";
        System.out.println(fruits);
        String[] split_fruits=fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2="ABC!XYZ!QWE";
        System.out.println(fruits2);
        String[] split_fruits2=fruits2.split("!");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4="Pramod";
        System.out.println(s4.charAt(0));
        System.out.println(s4.charAt(1));
        System.out.println(s4.charAt(2));
        System.out.println(s4.charAt(3));
        System.out.println(s4.charAt(4));
        System.out.println(s4.charAt(5));

    }
}
