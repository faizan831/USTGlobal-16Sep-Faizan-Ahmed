package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "faizan", 76.2);
		Student s2 = new Student(102, "lochan", 65.8);
		Student s3 =  new Student(103,"shareef",87.8);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0;i<al.size();i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
		System.out.println("-----------------");
		for(Student s : al) {
			System.out.println(s);
		}
		
	}
}
