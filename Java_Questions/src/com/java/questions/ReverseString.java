package com.java.questions;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String str) {
		if (str == null || str.trim().isEmpty())
			throw new IllegalArgumentException("Given value is empty");

		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value:");
		String str = scanner.nextLine();

		System.out.println("Given String: " + str + "\nReversed String: " + reverse(str));
		scanner.close();
	}
}
