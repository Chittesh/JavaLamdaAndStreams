package test.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;;

public class Functional05 {
	public static void main(String[] args) {
		printDistinctAllNumbersIsListStructered(Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS",
				"PCF", "Azure", "Docker", "Kubernetes"));
	}

	private static void printDistinctAllNumbersIsListStructered(List<String> ListValues) {
		// Sorting
		ListValues.stream().sorted().forEach(System.out::println);
		System.out.println("************************************************************");
		// Natural sorting
		ListValues.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("************************************************************");
		// Reverse order
		ListValues.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("************************************************************");
		// Order based on length of string
		ListValues.stream().sorted(Comparator.comparing(value -> value.length())).forEach(System.out::println);
	}

}
