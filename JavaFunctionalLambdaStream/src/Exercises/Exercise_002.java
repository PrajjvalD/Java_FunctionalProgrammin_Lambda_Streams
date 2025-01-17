package Exercises;

import java.util.List;

public class Exercise_002 {

	public static void main(String[] args) {	
		List<String> courses = List.of("Spring","AWS","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		// Print all courses individually
		System.out.println("Print all courses individually");
		courses.stream().forEach(System.out::println);
		// Print courses containing the word Spring
		System.out.println("\nPrint courses containing the word Spring");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		// Print courses whose name has atleast 4 letters
		System.out.println("\nPrint courses whose name has atleast 4 letters");
		courses.stream().filter(course -> course.length()>4).forEach(System.out::println);
		// Print the number of characters in each course name
		System.out.println("Print the number of characters in each course name");
		courses.stream().map(course -> course +" - "+ course.length()).forEach(System.out::println);

	}

	
}
