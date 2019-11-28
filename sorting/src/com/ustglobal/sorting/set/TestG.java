package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(12,"shareef",45000);
		Employee e2 = new Employee(34,"faizan",70000);
		Employee e3 = new Employee(45,"ghazan",67000);
		Employee e4 = new Employee(30,"rafi",78000);
		Employee e5 = new Employee(30,"rafi",78000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("**********Using iterator");
		
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is"+e.id);
			System.out.println("Name is"+e.name);
			System.out.println("Salary is "+e.salary);
		}
		
		
		
	}
}
