package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie(2020, "Bahui", 5.0);
		Movie m1=new Movie(2012, "Mirchi", 4.5);
		Movie m2=new Movie(2012, "Aru", 3.5);
		Movie m3=new Movie(2024, "Pihu", 3.5);
		
		ArrayList<Movie> list= new ArrayList<Movie>();
		list.add(m);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Comparator nameYearComparator=Comparator.comparing(Movie::getYear,Comparator.reverseOrder())
				.thenComparing(Movie::getRating);
		list.sort(nameYearComparator);
		
		list.stream().forEach(x->{
		System.out.println(x.getName()+" "+x.getYear()+" "+x.getRating());
		}
		);
		//Intermediate Opertaions- reduce, map, filter, sorted
		Set<Double> s=list.stream()
		.filter(mv->!mv.getName().endsWith("u"))
		.map(mv->mv.getRating()+1.0)
		 .collect(Collectors.toSet());
		
		double sum=s.parallelStream().reduce(0.0,(subtotal, element) -> subtotal + element);
		System.out.println("Hey I usedReduce Operation "+sum);
		
		s.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
		String input = "This is a beautiful world";
		String[] arr = Arrays.stream(input.split(" "))
		                     .sorted(Comparator.comparingInt(String::length))
		                     .toArray(String[]::new);
		// prints output
		System.out.println(Arrays.toString(arr));
	}

}
