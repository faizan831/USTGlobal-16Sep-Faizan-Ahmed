package com.ustglobal.thread.pausing;

public class testThread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		System.out.println("Main ended");
	}

}
