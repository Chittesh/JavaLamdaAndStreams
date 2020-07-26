package test.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;;

public class Functional09_PredeicateParameter {
	public static void main(String[] args) {

		printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	private static void printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(List<Integer> ListValues) {

		getFilteredAndMapped(ListValues, number -> number % 2 == 0, number -> number * number);
		getFilteredAndMapped(ListValues, number -> number % 2 == 1, number -> number * number);

	}

	private static void getFilteredAndMapped(List<Integer> ListValues, Predicate<Integer> predicate,
			Function<Integer, Integer> function) {
		ListValues.stream().filter(predicate).map(function).forEach(System.out::println);
	}

}
