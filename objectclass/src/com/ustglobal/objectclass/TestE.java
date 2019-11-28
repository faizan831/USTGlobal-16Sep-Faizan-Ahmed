package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {
		
		Car c = new Car(02, "audi", "black");
		int cc = c.hashCode();
		
		System.out.println("overriden hashCode() "+cc);
		System.out.println("overriden toString"+c);
	}
}
