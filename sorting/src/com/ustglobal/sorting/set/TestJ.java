package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortByCustomerName sn = new SortByCustomerName();
		TreeSet<Customer> ts = new TreeSet<Customer>(sn);//(sb);(sm);
		Customer b1 = new Customer(101,"faizan",30000);
		Customer b2 = new Customer(102,"shareef",65006);
		Customer b3 = new Customer(103,"amit",675687);
		Customer b4 = new Customer(104,"lochan",565676);
		Customer b5 = new Customer(104,"lochan",565676);
	
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("***********Using iteratot******");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer b = it.next();
			System.out.println("Customer id "+b.id);
			System.out.println("name is "+b.name);
			System.out.println("salary is "+b.salary);
			System.out.println("============================");
		}
		
	}

}
