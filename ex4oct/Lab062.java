package com.example.ex4oct;

public class Lab062 {
    // Nested Ternary
    // result = condition ? expression :(condition2 ? expression2 : expression3);

    // if the score is 90 or above, the grade will be "A"
    // if the score is between 80 and 89, the grade will be "B"
    // if the score is between 70 and 79, the grade will be "C"
    // if the score is between 60 and 69, the grade will be "D"
    // if the score is below 60, the grade will be "F"
    public static void main(String[] args) {
        int score =58;
        String grade= (score>=90) ? "A": (score>=80) ? "B" :(score>=70) ? "C" : (score>=60) ? "D" :"F";
        System.out.println("Your Grade is -> " +grade);
        System.out.printf("Your Grade is %s",  grade);
    }

}
