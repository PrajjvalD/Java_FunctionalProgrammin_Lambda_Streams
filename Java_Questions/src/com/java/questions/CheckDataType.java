package com.java.questions;

public class CheckDataType {

    public static boolean isNumeric(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);  // Try to parse it as a number
            return true;
        } catch (NumberFormatException e) {
            return false;  // If parsing fails, it's not a number
        }
    }

    public static void main(String[] args) {
        String value = "abc12";  // Change this value to test
        
        if (isNumeric(value)) {
            System.out.println(value + " is a number.");
        } else {
            System.out.println(value + " is a string.");
        }
    }
}
