package com.ustglobal.sorting.list;

public class Pen {
	double price;
	String brand;

	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public int compareTo(Pen s) {

		if(this.price>s.price) {
			return 1;
		}else if(this.price<s.price) {
			return -1;
		}else {
			return 0;
		}



	}
}