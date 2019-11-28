package com.ustglobal.sorting.list;

public class Laptop {
	double price;
	int ram;
	String name;

	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	public int compareTo(Laptop lp) {
		Double i= this.price;
		Double j = lp.price;

		return i.compareTo(j);

	}
}

