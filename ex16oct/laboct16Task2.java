package com.example.ex16oct;

import java.util.Scanner;

public class laboct16Task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        int result =(a>b) ? a:b;
        System.out.println("The Maximum number is " +result);
    }
}
