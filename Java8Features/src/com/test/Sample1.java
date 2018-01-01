package com.test;

import com.test.Java8Tester.MathOperation;

public class Sample1 {
	
	public static void main(String args[]) {
		 MathOperation addition = (int a, int b) -> a + b;
		 Sample1 s = new Sample1();
		 System.out.println("10 + 5 = " + s.operate(10, 5, addition));
		System.out.println(addition.operation(1, 2));
	}
	
	
	  interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
		      return mathOperation.operation(a, b);
		   }
		

	
}
