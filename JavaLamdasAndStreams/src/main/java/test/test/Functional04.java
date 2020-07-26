package test.test;

import java.util.Arrays;
import java.util.List;;

public class Functional04 {
	public static void main(String[] args) {
		printDistinctAllNumbersIsListStructered(Arrays.asList(4, 3, 2, 8 ,5,  5, 7, 8));
	}

	private static void printDistinctAllNumbersIsListStructered(List<Integer> ListValues) {
		//To Get distinct values
		ListValues.stream().distinct().forEach(System.out::println);
		System.out.println("*******************");
		//Sorting
		ListValues.stream().sorted().forEach(System.out::println);
	}

}
