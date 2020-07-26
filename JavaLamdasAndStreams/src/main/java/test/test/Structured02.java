package test.test;

import java.util.Arrays;
import java.util.List;;

public class Structured02 {
	public static void main(String[] args) {

		printSumOfAllNumbersIsListStructered(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	private static void printSumOfAllNumbersIsListStructered(List<Integer> ListValues) {

		int sum = 0;
		for (int integer : ListValues) {
			sum = sum + integer;
		}
		System.out.println(sum);
	}

}
