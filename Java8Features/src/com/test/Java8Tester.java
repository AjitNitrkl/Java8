package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8Tester {

	   public static void main(String args[]) {
	      Java8Tester tester = new Java8Tester();
	      
	      
	  	Supplier<String> s = ()->{
			return "Supplier working";
		};
		System.out.println(s.get());
		List<Integer> lists = Arrays.asList(
                new Integer(30),
                new Integer( 20),
                new Integer(40),
                new Integer(37),
                new Integer(41),
                new Integer(43)
        );

       Integer res = lists.stream()                       
                .filter(x -> x==40)       
                .findAny()                                     
                .orElse(null);  
      List<Integer> newList =  lists.stream().filter(x -> x%2!=0)
       				.collect(Collectors.toList());
        
        System.out.println(res);
        System.out.println(newList);
        lists.sort((Integer i1, Integer i2) -> i1-i2);
        System.out.println(lists);
        
	      MathOperation addition = (int a, int b) -> a + b;
	      MathOperation subtraction = (a, b) -> a - b;
	      //System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	 
	   
	   private int operate(int a, int b, MathOperation mathOperation) {
		      return mathOperation.operation(a, b);
		   }
		
	 
	}