package test.test;

import java.util.Arrays;
import java.util.List;;

public class Structured01 {
	public static void main(String[] args) {

		printAllNumbersIsListStructered(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	private static void printAllNumbersIsListStructered(List<Integer> ListValues) {
		for (int integer : ListValues) {
			System.out.println(integer);
		}

	}

	private static void printEvenNumbersIsListStructered(List<Integer> ListValues) {
		for (int integer : ListValues) {
			if (integer % 2 == 0) {
				System.out.println(integer);
			}

		}

	}

}
