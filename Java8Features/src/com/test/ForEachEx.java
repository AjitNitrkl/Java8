package com.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachEx {

	public static void main(String[] args) {
		List<String> cricketers = Arrays.asList("Sachin", "Saurav", "Rahul", "Virat", "Yuvi", "Zaheer","Mahi","Viru","Anil");
		
		//BigDecimal d = 2.4;
	
		System.out.println(BigDecimal.valueOf(2.421123).multiply(BigDecimal.valueOf(2.121233)));
		double d = 0.1;
		String d2="2.4123";
		String d3="3.45";
		BigDecimal bd1 = new BigDecimal(d);
		BigDecimal bd2 = BigDecimal.valueOf(d);
		BigDecimal bd3 =  new BigDecimal(d2);
		BigDecimal bd4 =  new BigDecimal(d3);
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3.multiply(bd4));
		
		/*BigDecimal value = new  BigDecimal(7.2);
		
		BigDecimal rxOriginalQuantity = new  BigDecimal(2.4);
		BigDecimal refRem = new  BigDecimal(2);
		
		BigDecimal rxRemainingQty = (refRem.add(new BigDecimal("1"))).multiply(rxOriginalQuantity);
		System.out.println(rxRemainingQty);
		System.out.println(rxRemainingQty.compareTo(value));
		System.out.println(value.compareTo(rxRemainingQty));*/
		

	//Imperative style using Iterator
	Iterator<String> iterator = cricketers.iterator();
	System.out.print("Using While loop ->");
	while(iterator.hasNext()){
		String cricketer = iterator.next();
		System.out.print(cricketer +" ");
		}
		System.out.println("");
		System.out.print("Using For  loop ->");	
	for(String cricketer: cricketers) {
		System.out.print(cricketer+" ");
	}
		
	System.out.println("");
	System.out.print("Using ForEach  loop introduced in java 8 ->");	
	//Using forEach() method added to Iterable in Java 8 and anonymous inner class
	
	
	
	cricketers.forEach(new Consumer<String>() {
		@Override
		public void accept(String cricketer) {
			System.out.print(cricketer+" ");
			
		}
	});
	
	//Using forEach() method added to Iterable and Lambda expression Java 8
	
	System.out.println("");
	System.out.print("Using ForEach loop & lambda expr introduced in java 8 ->");
	cricketers.forEach(cricketer-> System.out.print(cricketer+" "));
	System.out.println("");
	
	//Using forEach() method added to Iterable, Lambda expression and Method reference in Java 8
	System.out.println("");
	System.out.print("Using ForEach loop & lambda expr introduced in java 8 ->");	
	cricketers.forEach(System.out::print);
		
	}
	
}
