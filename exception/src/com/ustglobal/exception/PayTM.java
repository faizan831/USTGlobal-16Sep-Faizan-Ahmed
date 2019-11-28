package com.ustglobal.exception;

public class PayTM {
	
	void book() {
		System.out.println("PayTM started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("PayTM ended");
	}
}
