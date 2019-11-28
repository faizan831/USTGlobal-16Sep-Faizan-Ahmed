package com.ustglobal.thread.pausing;

public class Counter {
	int v;
	public void increment() {
		v++;
	}
	public void decrement() {
		v--;
	}
	synchronized public void showValue() {
		System.out.println("V value is "+v);
	}

}
