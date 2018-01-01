package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Person {
	Person(){
		
	}
	
	Person(int id, String name, int age, Sex gender,Integer ssn){
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.ssn=ssn;
	}
    public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	public enum Sex {
        MALE, FEMALE
    }
    int id;
    Integer ssn;
    String name;
    int age;
    Sex gender;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Sex getGender() {
		return gender;
	}


	public void setGender(Sex gender) {
		this.gender = gender;
	}


	public static int compareByAge(Person a, Person b) {
        return new Integer(a.getAge()).compareTo(new Integer(b.getAge()));
    }
	
	public String toString() {
		return name + " " + age+" "+gender+" "+ssn;
		}
    
    
    }

public class ComparatorLambdaEx1 {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1,"Ajit",32,Person.Sex.MALE,567));
		persons.add(new Person(2,"Shubhra",25,Person.Sex.FEMALE,123));
		persons.add(new Person(3,"Shubhrajit",1,Person.Sex.MALE,345));
	
		Collections.sort(persons, new Comparator<Person>() {

		@Override
		public int compare(Person p1, Person p2) {
			 return new Integer(p1.getId()).compareTo(new Integer(p2 .getId()));
			}
		});
		System.out.println(persons);
		
		Collections.sort(persons,(p1,p2) ->p1.getSsn().compareTo(p2.getSsn()) );
		System.out.println(persons);
		
		Collections.sort(persons, (p1,p2)->Person.compareByAge(p1, p2));
		System.out.println(persons);
		
		
	/*
	 * method to compare the age of two Person instances already exists as Person.compareByAge.
	 *  You can invoke this method instead in the body of the lambda expression:
	 *  /
	 * 	The method reference Person::compareByAge is semantically 
		the same as the lambda expression
		(a, b) -> Person.compareByAge(a, b). 
		Each has the following characteristics: */
		
		
		//compareByAge is static method so classname ::methodname 
		//for non static it will be object::methodname
		
		Collections.sort(persons,Person::compareByAge);
		System.out.println(persons);
	
	
	}
	
	
}
