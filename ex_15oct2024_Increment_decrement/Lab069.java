package com.example.ex_15oct2024_Increment_decrement;

public class Lab069 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A  -> ++a -> 11 , a-> 11
        //  +
        // B- > ++a  -> 12, a -> 12
        // A+ B ->  11+12

    }
}
