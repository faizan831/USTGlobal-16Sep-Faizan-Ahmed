package com.ustglobal.exception;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main Started");

		int a = 10;
		int b = 0;
		try {
			b= 10/0;
			System.out.println(b);
			System.out.println("lochan bhai");
		}catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}

	

		System.out.println("Main ended");
	}
}
