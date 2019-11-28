package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {
		
		Student s = new Student(10, "faizan", 62.5);
		Student s2 = new Student(11,"shareef",75.7);
		int sCode = s.hashCode();
		
		System.out.println("overriden HashCode() :" +sCode);
		System.out.println("overriden toString() :" +s);
		
	}
}
