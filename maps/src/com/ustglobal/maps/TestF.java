package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		Student s1 = new Student(2, "faizan",67.98);
		Student s2 = new Student(6, "shareef", 88.7);
		Student s3 = new Student(87, "lochan", 69.5);
		Student s4 = new Student(1, "amit", 76.4);
		Student s5 = new Student(3, "ghazan", 71.4);
		Student s6 = new Student(16, "rafi", 72.4);
		Student s7 = new Student(7, "rumu", 73.4);
		Student s8 = new Student(64, "pali", 70.4);
		Student s9 = new Student(60, "asim", 78.4);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("==============================================");
		}
		
		
	}

}
