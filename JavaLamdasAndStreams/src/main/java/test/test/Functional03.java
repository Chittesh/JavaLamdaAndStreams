package test.test;

import java.util.Arrays;
import java.util.List;;

public class Functional03 {
	public static void main(String[] args) {
		printSumOfAllNumbersIsListStructered(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	private static void printSumOfAllNumbersIsListStructered(List<Integer> ListValues) {
		System.out.println(ListValues.stream().reduce(0, (x, y) -> (x + y)));
		System.out.println(ListValues.stream().reduce(0, (x, y) -> (x)));
		System.out.println(ListValues.stream().reduce(0, (x, y) -> (y)));
		System.out.println(ListValues.stream().reduce(0, (x, y) -> (x > y ? x : y))); //Max Value
		System.out.println(ListValues.stream().reduce(0, (x, y) -> (x > y ? y : x))); //Min Value
		//Getting Squares and getting sum of it
		System.out.println(ListValues.stream().map(number -> number * number).reduce(0, (x, y) -> (x + y)));
		//Getting Sum of only Even number
		System.out.println(ListValues.stream().filter(number -> number%2==0).reduce(0, (x, y) -> (x + y)));
	}

}
