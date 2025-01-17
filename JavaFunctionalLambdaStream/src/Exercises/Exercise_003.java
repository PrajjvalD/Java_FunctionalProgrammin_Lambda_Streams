package Exercises;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise_003 {

    public static void main(String[] args) {    
        List<String> courses = List.of("Spring", "AWS", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes", "AWS");

        // Count occurrences of each course
        Map<String, Long> courseCount = courses.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print out the map to debug
        System.out.println("Course counts: " + courseCount);

        // Print courses that occurred more than 2 times
        System.out.println("\nCourses that occurred more than 2 times:");
        courseCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .forEach(System.out::println);
    }
}
