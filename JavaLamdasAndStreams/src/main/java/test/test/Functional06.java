package test.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;;

public class Functional06 {
	public static void main(String[] args) {
		convertToAnotherSet(Arrays.asList(4, 3, 2, 8, 5, 5, 7, 8));
	}

	private static void convertToAnotherSet(List<Integer> ListValues) {

		Set<Integer> set = ListValues.stream().map(number -> number * number).collect(Collectors.toSet());
		
		set.stream().forEachOrdered(System.out::println);
	}

}
