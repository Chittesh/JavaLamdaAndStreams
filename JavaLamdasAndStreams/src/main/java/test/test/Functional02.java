package test.test;

import java.util.Arrays;
import java.util.List;;

public class Functional02 {
	public static void main(String[] args) {
		System.out.println(printSumOfAllNumbersIsListStructered(Arrays.asList(2, 3, 4, 5, 7, 8)));
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate+"   "+nextNumber);
		return aggregate + nextNumber;
	}

	private static Integer printSumOfAllNumbersIsListStructered(List<Integer> ListValues) {
		//Stream of Number -> One Result value
		//Combine them into one result => One value
		// 0 intial value and the static method which we need to call
		return ListValues.stream()
				//.reduce(0, Functional02::sum);
				//.reduce(0, (x,y)->(x+y));
				.reduce(0, Integer::sum);
			
		
	}

}
