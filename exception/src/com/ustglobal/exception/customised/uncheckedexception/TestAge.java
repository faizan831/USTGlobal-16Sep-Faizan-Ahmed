package com.ustglobal.exception.customised.uncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Validator v = new Validator();
		try {
		v.verify(12);
		}catch(InvalidAgeException ie) {
			
			System.out.println("exception occured");
		}
		v.verify(20);
		System.out.println("main ended");
	}
}
