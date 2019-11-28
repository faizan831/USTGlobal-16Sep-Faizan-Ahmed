package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("Main started");
		MyThread mt = new MyThread();
		mt.start();
//		mt.start(); IllegalThreadStateException
		/*
		 * mt.run(); 
		 * Don't call run() method, it behaves like normal program
		 * All code will be executed inside main thread only
		 */
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
		System.out.println("Main ended");
	}

}
