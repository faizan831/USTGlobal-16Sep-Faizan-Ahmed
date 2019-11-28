package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(34.2);
		ls.add(67.1);
		ls.add(85.8);
		ls.add(34.3);
		ls.add(85.8);
		ls.add(34.8);
		
		System.out.println("*************using forEach******");
		for(Double s : ls) {
			System.out.println(s);
		}
		System.out.println("*************using iterator************");
		Iterator<Double> it =  ls.iterator();
		while(it.hasNext()) {
			Double p = it.next();
			System.out.println(p);
		}
	}
}
