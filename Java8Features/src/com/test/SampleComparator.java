	package com.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleComparator {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();
		
		 listDevs.stream().sorted().forEach(System.out::println);;
		 listDevs.stream().toArray(Developer[]::new);
		 Double[]  d = {10.0,20.0, 90.0};
		Stream stream = Stream.of(d);
		List<Double> listDouble = (List<Double>) stream.collect(Collectors.toList());
		stream.forEach(System.out::println);
		

		/* Supplier<Stream> s = () -> Stream.of(d);
		Supplier<Stream<Double>> sup = () -> Stream.of(d);
		sup.get();
		sup.get();
		sup.get();
		sup.get();*/
		
		/*for (Developer developer : dev) {
			System.out.println(developer);
		}
*/

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			//System.out.println(developer);
		}

		System.out.println("After Sort");
		//lambda here!
		listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		//or
		listDevs.sort(( o1,  o2)->o1.getAge()-o2.getAge());
		listDevs.stream().sorted();

		//java 8 only, lambda also, to print the List
		//listDevs.forEach((developer)->System.out.println(developer));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}