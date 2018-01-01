package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	private int cid;
	private String cname;
	Customer(int cid, String cname) { 
		this.cid = cid;
		this.cname = cname;
		}
	public Integer getCid() { return cid; }
	public String getCname() { return cname; }
	
	public String toString() {
		return cid + " " + cname;
		}
}

public class ComparatorLambda {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(3, "pqr"));
		customers.add(new Customer(1, "lmno"));
		customers.add(new Customer(2, "a"));
		customers.add(new Customer(4, "xy"));
		
		
		/*Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer cust1, Customer cust2) {
				// TODO Auto-generated method stub
				return cust1.getCid().compareTo(cust2.getCid());
			}
			
		});
		
		System.out.println("Using Anonymous Call->"+ customers);*/
	
	//Collections.sort(customers, (c1,c2)->c1.getCname().compareTo(c2.getCname()));
		
	//	customers.sort((Customer c1, Customer c2)->c1.getCname().length() - c1.getCname().length());
		
		customers.sort((Customer o1, Customer o2)->o1.getCid()-o2.getCid());
		
		System.out.println("Using Lambda  expression->"+ customers);
		
	}
	
	
	 
}
