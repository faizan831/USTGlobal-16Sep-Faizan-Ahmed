package com.ustglobal.exception;

public class BMS {
	public static void main(String[] args) {
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("booking falied");
		}
		System.out.println("bms ended");
	}
}
