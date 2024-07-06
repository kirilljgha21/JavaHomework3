package com.telran.org.homework;

import java.util.Scanner;

public class HomeworkThree {


    public static int getAddingNumber(int num1, int num2) {

        return num1 + num2;
    }

    public static int getSubtractionNumber(int num1, int num2) {

        return num1 - num2;
    }

    public static int getMultiplyingNumber(int num1, int num2) {

        return num1 * num2;
    }

    public static int getDivisionNumber(int num1, int num2) {

        return num1 / num2;
    }

    public static String firstMethod(String input) {
        String upperCaseString = input.toUpperCase();
        return secondMethod(upperCaseString);
    }

    public static String secondMethod(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a Number from task (1 or 2)");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("You have select task a Number 1");
            System.out.println("Please select action:");
            System.out.println("1 - Adding(+), 2 - Subtraction(-), 3 - Multiplying, 4 - division");
            int select1 = scanner.nextInt();
            if (select1 == 1) {
                System.out.println("Please get a first number:");
                int a = scanner.nextInt();

                System.out.println("Please get a second number:");
                int b = scanner.nextInt();

                int result1 = getAddingNumber(a, b);
                System.out.println("Result: " + a + " + " + b + " = " + result1);

            } else if (select1 == 2) {
                System.out.println("Please get a first number:");
                int a = scanner.nextInt();

                System.out.println("Please get a second number:");
                int b = scanner.nextInt();

                int result1 = getSubtractionNumber(a, b);
                System.out.println("Result: " + a + " - " + b + " = " + result1);

            } else if (select1 == 3) {
                System.out.println("Please get a first number:");
                int a = scanner.nextInt();

                System.out.println("Please get a second number:");
                int b = scanner.nextInt();

                int result1 = getMultiplyingNumber(a, b);
                System.out.println("Result: " + a + " * " + b + " = " + result1);

            } else if (select1 == 4) {
                System.out.println("Please get a first number:");
                int a = scanner.nextInt();

                System.out.println("Please get a second number:");
                int b = scanner.nextInt();

                int result1 = getDivisionNumber(a, b);
                System.out.println("Result: " + a + " / " + b + " = " + result1);

            } else {
                System.out.println("Wrong Number!");

            }
        } else if (select == 2) {
            System.out.println("You have select task a Number 2");
            String input = "hello world";
            String result = firstMethod(input);
            System.out.println(result);

        } else {
            System.out.println("Wrong Number from task!");
        }

    }
}
