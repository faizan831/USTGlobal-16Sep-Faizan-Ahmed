package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestI {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(1, "faizan");
		Employee e2 = new Employee(6, "shareef");
		Employee e3 = new Employee(3, "dhoni");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> comp = (e5, e6) ->{
			return e5.name.compareTo(e6.name);
		};
		
		List<Employee> l = al.stream().sorted(comp).collect(Collectors.toList());
		Iterator<Employee> it = l.iterator();
		System.out.println("Sorted ----->");
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("========================");
			
			
		}
	}

}
