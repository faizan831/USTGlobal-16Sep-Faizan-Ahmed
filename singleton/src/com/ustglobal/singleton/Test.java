package com.ustglobal.singleton;

public class Test {
	
	public static void main(String[] args) {
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "hello";
		System.out.println("HashCode of ms " +ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "hi";
		System.out.println("HashCode of mx " +mx.hashCode());
		
		System.out.println(ms.s);
		
	}

}
