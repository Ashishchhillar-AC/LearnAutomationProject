package com.example.ex_18oct2024_ifcondition_switch;

import java.util.Scanner;

public class lab075_HackerrankQ2 {
    public static void main(String[] args) {


        // ✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 → eq, iso, scalene

        // Logic Building
        // Step 1
        // Find the inputs / outputs
        // Input | side1,side2,side3 -> data type -> double
        // Output | SOP -> String or message -> Equilateral, Isosceles, Scalene.
        Scanner scanner=new Scanner(System.in);
        // Input read the lengths of the sides
        System.out.println("Enter the length of side 1");
        double side1=scanner.nextDouble();
        System.out.println("Enter the length of side 2");
        double side2=scanner.nextDouble();
        System.out.println("Enter the length of side 3");
        double side3=scanner.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input: Side lengths must be positive.");
        }
        else if(side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("The triangle is equilateral.");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }

        scanner.close();

    }
}
