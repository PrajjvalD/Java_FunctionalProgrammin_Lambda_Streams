package com.java.questions;

import java.util.Scanner;

public class ReverseNumber {

	public static Integer reverse(Integer num) {
		if (num < 0) 
			throw new IllegalArgumentException("Negative values not supported");

		StringBuilder revStr = new StringBuilder(Integer.toString(num)).reverse();
		return Integer.parseInt(revStr.toString());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value:");
		Integer num = scanner.nextInt();
		System.out.println("Before reverse: " + num+" datatype: "+num.getClass().getTypeName());
		System.out.println("After reverse: " + reverse(num) +" datatype: "+num.getClass().getTypeName());
		scanner.close();
	}
}
