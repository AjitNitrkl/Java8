package com.test;

import java.math.BigDecimal;

public class Developer implements Comparable<Developer> {
	
	private String name;
	private BigDecimal salary;
	private int Age;
	private String gender;
	
	public Developer(String name, BigDecimal sal, int age) {
		
		this.Age=age;
		this.name=name;
		this.salary=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public String toString(){
		return name+"-"+Age+"-"+salary;
	}
	@Override
	public int compareTo(Developer obj) {
		
		Developer d =(Developer)obj;
		return - d.Age - this.Age;
	}
	
	
	
	

}
