package test.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;;

public class Functional07 {
	public static void main(String[] args) {

	
		printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(Arrays.asList(2, 3, 4, 5, 7, 8));
	}

	
	private static void printEvenNumbersIsListFunctionalUsingLambdaExpressAndMap(List<Integer> ListValues) {
		//Predicate interface how lambda expression is mapped 
		Predicate<Integer> predicate = number -> number % 2 == 0;
		Function<Integer, Integer> function = number -> number * number;
		Consumer<? super Integer> consumer = System.out::println;
		
		ListValues.stream()
			.filter(predicate)
			.map(function)
			.forEach(consumer);
	}

}
