package Exercises;

import java.util.List;

public class Exercise_004 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 1, 4, 2, 7, 9, 3, 10, 77);
		// Square every number in a list and find the sum of squares
		System.out.println("Square every number in a list and find the sum of squares");
		int sqrSum = addSquareEachNumberListFunctional(numbers);
		System.out.println(sqrSum);
		int oddSum = addOddEachNumberListFunctional(numbers);
		System.out.println(oddSum);
	}

	private static int addOddEachNumberListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(x -> x % 2 != 0).reduce(0, (x, y) -> x + y);
	}

//	public static int sum(int a, int b) {
//		System.out.println(a+" "+b);
//		return (a*a) + b;
//	}

	public static int addSquareEachNumberListFunctional(List<Integer> numbers) {
		// return numbers.stream().reduce(0, Integer::sum);
		return numbers.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
	}

}
