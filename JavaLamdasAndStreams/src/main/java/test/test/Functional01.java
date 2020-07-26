package test.test;

import java.util.Arrays;
import java.util.List;;

public class Functional01 {
	public static void main(String[] args) {

		printAllNumbersIsListFunctional(Arrays.asList(2, 3, 4, 5, 7, 8));
		System.out.println("**********************");
		printEvenNumbersIsListFunctional(Arrays.asList(2, 3, 4, 5, 7, 8));
		System.out.println("**********************");
		printEvenNumbersIsListFunctionalUsingLambdaExpress(Arrays.asList(2, 3, 4, 5, 7, 8));
		System.out.println("**********************");
		printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	private static void printAllNumbersIsListFunctional(List<Integer> ListValues) {
		ListValues.stream().forEach(System.out::println);
	}

	private static void printEvenNumbersIsListFunctional(List<Integer> ListValues) {
		ListValues.stream().filter(Functional01::isEven)// we use fiter method to filter values based on a method
				.forEach(System.out::println);
	}

	private static boolean isEven(int number) {
		return (number % 2 == 0);

	}

	private static void printEvenNumbersIsListFunctionalUsingLambdaExpress(List<Integer> ListValues) {
		ListValues.stream()
				.filter(number -> number % 2 == 0) //using Lambda expression
				.forEach(System.out::println);
	}
	
	private static void printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(List<Integer> ListValues) {
		ListValues.stream()
				.filter(number -> number % 2 == 0) //using Lambda expression
				.map(number -> number * number) //Using Map to get square of element
				.forEach(System.out::println);
	}

}
