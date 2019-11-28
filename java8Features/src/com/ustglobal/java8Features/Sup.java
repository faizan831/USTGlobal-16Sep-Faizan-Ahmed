package com.ustglobal.java8Features;

public class Sup {
	public Number test() {
		//return new Object();
		return new Integer(10);
	}

}
class Sub extends Sup {
	@Override
	public Number test() {
		//return new String();
		return new Integer(10);
	}
}
