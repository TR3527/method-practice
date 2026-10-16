package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        int number = 8;
        double number2 = .5;

        //  isEven(int number); not needed
        //  isPositive(); not needed

        System.out.println("is the number even?" + isEven(number));
        System.out.println("Is the number positive?" + isPositive(number2));

    }

    public static boolean isEven(int number) {
        boolean evenCheck = (number % 2 == 0);
        return evenCheck;

    }

    public static boolean isPositive(double number2) {
        boolean positiveCheck = (number2 > 0);

        return positiveCheck;
    }
}