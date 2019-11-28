package com.ustglobal.java8Features;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=========================================");
		};
		Student s1 = new Student(2, "shareef", 67.8);
		c.accept(s1	);
		
	}

}
