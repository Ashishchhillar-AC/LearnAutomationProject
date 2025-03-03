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

        String s5= "Ashish  ";
        System.out.println(s5);
        System.out.println(s5.trim());
        System.out.println(s5.indexOf("h"));

        String s6="AshishChhillar";
        System.out.println(s6.indexOf("c"));
        System.out.println(s6.indexOf("i"));
        System.out.println(s6.contains("A"));
        System.out.println(s6.contains("n"));

        String s7 = "Ashish";
        System.out.println(s7.lastIndexOf('h'));

        String s8="Ashish";
        System.out.println(s8.replace('A','k'));
        String original="Banana";
        String result1= original.replace('a','o');
        System.out.println(result1);

        String original1="Hello123 World456!";
        String result2=original1.replaceAll("\\d+", "");
        System.out.println(result2);



    }
}
