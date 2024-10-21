package com.example.task17oct;

import java.util.Scanner;

public class task1oct17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark :");
        int score = sc.nextInt();

        if (score >=90 && score <=100){
            System.out.println("Your grade is A");
        } else if (score>=80 && score<=89){
            System.out.println("Your Grade is B");
        }else if(score>=70 && score<=79){
            System.out.println("Your Grade is C");
        }else if(score>=60 && score <=69 ){
            System.out.println("Your grade is D");
            }else if (score>=0 && score <=59) {
                System.out.println("Your Grade is E");
            } else {
                System.out.println("Invalid mark, please enter between 1 and 100");
            }
            sc.close();
        }
    }

