package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;   // Boxing or Auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		System.out.println("x is "+x);
		int y = x;  //unboxing auto un boxing
		System.out.println("y is " +y);
		
		int value = Integer.parseInt("123");
		System.out.println("Value is " +value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
		

		int value1 = Integer.parseInt("123abcd");
		System.out.println("Value is " +value1);
		
		boolean result1 = Boolean.parseBoolean("true");
		System.out.println("Result is "+result1);
	}
}
