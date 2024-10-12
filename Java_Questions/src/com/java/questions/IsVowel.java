package com.java.questions;

import java.util.Scanner;

public class IsVowel {

	public static Boolean IsVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value:");
		String str = scanner.nextLine();
		System.out.println("Given value is: " + str);
		if(IsVowels(str)) {
			System.out.println("vowel is present");
		}else {
			System.out.println("vowel is not present");
		}
		scanner.close();
	}

}
