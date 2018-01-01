package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx1 {

	public static void main(String[] args) {

		List<Persons> people = Arrays.asList(
				new Persons("Ajit",10,"Chicago"),
				new Persons("Shubhra",20,"Wheeling"),
				new Persons("Anil",30,"Pkd")
				);
		/*Collections.sort(people, new Comparator<Persons>() {

			@Override
			public int compare(Persons p1, Persons p2) {
				return p1.getAge()-p2.getAge();
			}
		});*/
		
		
		Collections.sort(people, (p1,p2)->p1.getAge()-p2.getAge());
		
		printAll(people);
		
		
		

		Persons per = new Persons("Sachin", 1, "Mumbai");
		//The lambda expression method signature should be same as below takes an argument & return nothing.
		//The interface cannot have any other method
		
		MyConsumer<Persons> myLambda = (k)->System.out.println(k); 
		myLambda.myAccept(per);
		
		//can also make use of some inbuilt interfaces
		Consumer<Persons> javaConsumer = (k)->System.out.println(k);
		javaConsumer.accept(per);
		
	}

	private static void printAll(List<Persons> people) {
	//	people.forEach(p->System.out.println(p));
		
		people.forEach(new Consumer<Persons>(){

			@Override
			public void accept(Persons t) {
			//	System.out.println(t);
			}
			
		});
	
	}
	
	
}



