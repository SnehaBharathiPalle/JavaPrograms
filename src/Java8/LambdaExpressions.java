package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Functional Programming- What to do
		// Functional interface-An Interface with only one abstract method
		// we only specify what to do
		System.out.println();
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		List<Integer> li = Arrays.asList(numbers);
		List<Integer> list = li.stream().filter(i -> i % 2 == 0).map(i -> i * 2).sorted(Comparator.reverseOrder())
				.collect((Collectors.toList()));
		//supplier
		//Predicate
		//Consumer
		//Function
		List<Integer> l=new ArrayList<>();
		

	}

}
