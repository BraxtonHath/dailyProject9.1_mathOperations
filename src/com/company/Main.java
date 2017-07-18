package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please give 2 numbers");
        Scanner usersPick = new Scanner(System.in);

        System.out.println("First Number");
        String numOne = usersPick.nextLine();
        double n1 = Integer.parseInt(numOne);
        System.out.println("Second Number");
        String numTwo = usersPick.nextLine();
        double n2 = Integer.parseInt(numTwo);

//        System.out.println("operator limited to( +, -, /, *");
//        String operation = usersPick.next();

        double sum = (n1 + n2);
        double subtract = (n1 - n2);
        double division = (n1 / n2);
        double multiple = (n1 * n2);

        showResults(sum, subtract,  division,  multiple);

    }

    public static void showResults(double sum, double subtract, double division, double multiple) {
        System.out.println("your answer for sum is:" + sum);
        System.out.println("your answer for subtraction is:" + subtract);
        System.out.println("your answer for division is:" + division);
        System.out.println("your answer for multiplying is:" + multiple);

    }
}










