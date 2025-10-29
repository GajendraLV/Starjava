package com.Technical.internal;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner to read input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Take number input from user

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        sc.close(); // Close the scanner
    }
}
