package com.ustglobal.exception.customised.uncheckedexception;

public class InvalidAgeException extends RuntimeException {

	String message  = "Invalid age below 18 year not allowed";

	public InvalidAgeException() {


	}
	public InvalidAgeException(String message) {
		this.message = message;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	@Override
	
	public String getMessage() {
		return message;
	}
}
