package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestB {
	public static void main(String[] args) {

		LinkedList<Laptop> li = new LinkedList<>();
		Laptop lp1 = new Laptop(25000,8,"Mac");
		Laptop lp2 = new Laptop(30000,4,"Dell");
		Laptop lp3 = new Laptop(65000,12,"HP");
		Laptop lp4 = new Laptop(50000,8,"Asus");

		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		li.add(new Laptop(20000,2, "acer"));

		System.out.println("Before sorting-----");
		displayLaptopDetails(li);
		
		System.out.println("After sorting------");
		displayLaptopDetails(li);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("Price is " +lp.price);
			System.out.println("Ram is "+lp.ram);
		}
	}

}

