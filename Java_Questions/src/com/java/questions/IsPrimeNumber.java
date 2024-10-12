package com.java.questions;

import java.util.Scanner;

public class IsPrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value:");
        int num = scanner.nextInt();
        System.out.println("Given value: " + num);
        System.out.println(num + (isPrime(num) ? " is a Prime Number!" : " is not a Prime Number!"));
        scanner.close();
    }
}
