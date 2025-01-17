package Exercises;

import java.util.List;

public class Exercise_001 {

	public static void main(String[] args) {

		List<Integer> lists = List.of(1,4,2,7,9,3,10,77);
		// Print only odd numbers from list
		System.out.println("Print only odd numbers from list");
		lists.stream().filter(list -> list%2 != 0).forEach(System.out::println);
		// Print the cubes of odd numbers from list
		System.out.println("Print the cubes of odd numbers from list");
		lists.stream().filter(list -> list%2!=0).map(list -> list * list * list).forEach(System.out::println);
	}

	
}
