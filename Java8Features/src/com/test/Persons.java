package com.test;

public class Persons {
	String name;
	int age;
	String city;
	Persons(String name, int age, String city){
		this.age=age;
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return name+"-"+age+"-"+city;
		
	}
	
}
