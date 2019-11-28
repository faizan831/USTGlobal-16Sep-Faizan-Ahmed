package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestI {
	public static void main(String[] args) {

		Employee s1 = new Employee(2, "faizan",67000.87);
		Employee s2 = new Employee(6, "shareef", 88000.7);
		Employee s3 = new Employee(87, "lochan", 69000.5);
		Employee s4 = new Employee(1, "amit", 76000.4);
		Employee s5 = new Employee(3, "ghazan", 71000.4);
		Employee s6 = new Employee(16, "rafi", 72000.4);
		Employee s7 = new Employee(7, "rumu", 73670.4);
		Employee s8 = new Employee(64, "pali", 70090.4);
		Employee s9 = new Employee(60, "asim", 78000.4);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("manager1", al);
		hm.put("manager2", al1);
		hm.put("manager3", al2);

		ArrayList<Employee> manager2 = hm.get("manager2");

		Iterator<Employee> it = manager2.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("==============================================");
		}

	}
}