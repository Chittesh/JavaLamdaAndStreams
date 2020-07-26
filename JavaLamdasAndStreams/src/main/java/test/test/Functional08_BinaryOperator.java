package test.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;;

public class Functional08_BinaryOperator {
	public static void main(String[] args) {
		System.out.println(printSumOfAllNumbersIsListStructered(Arrays.asList(2, 3, 4, 5, 7, 8)));
	}

	private static Integer printSumOfAllNumbersIsListStructered(List<Integer> ListValues) {

		//BinaryOperator<Integer> binaryOperator = Integer::sum;

		BinaryOperator<Integer> objBinaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {
				return a + b;
			}
		};

		return ListValues.stream().reduce(0, objBinaryOperator);

	}

}
