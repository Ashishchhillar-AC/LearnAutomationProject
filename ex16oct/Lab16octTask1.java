package com.example.ex16oct;

import java.util.Scanner;

public class Lab16octTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name =scanner.next();
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println("Enter the Salary");
        int Salary =scanner.nextInt();
        System.out.println("Name of Employee " +name);
        System.out.println("Age of Employee  " +age);
        System.out.println("Salary of Employee " +Salary);

    }
}
