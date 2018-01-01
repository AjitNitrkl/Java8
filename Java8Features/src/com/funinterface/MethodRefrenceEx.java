package com.funinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodRefrenceEx {
	
	public static void main(String a[]) {
		List<Integer> integers = Arrays.asList(1,12,433,5,324,1243,12341,124124);
		Optional<Integer> max = integers.stream().reduce(Math::max);//refer to static method
		max.ifPresent(val -> System.out.println(val));
		max.ifPresent(System.out::println); //refer to instance method from instance
		
		String str="calculate length using method refrences";
		
		MyFirstFunctionalInterface funIntf =s->s.length();
		MyFirstFunctionalInterface funIntf1 =String::length;
		int len = funIntf.calculate(str);
		int len1 = funIntf1.calculate(str);
		System.out.println(len);
		System.out.println(len1);
		
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");
		
		List<String> sorted = strings
		        .stream()
		        .sorted((s1, s2) -> s1.compareTo(s2))
		        .collect(Collectors.toList());
		 
		System.out.println(sorted);
		 
		List<String> sortedAlt = strings
		        .stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());
		 
		System.out.println(sortedAlt);
		
	}
	
	@FunctionalInterface//not mandatory
	 interface MyFirstFunctionalInterface {
		int calculate(String str);
	    };

}
