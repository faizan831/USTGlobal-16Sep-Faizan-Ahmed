package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("shareef");
		ls.add(85.8);
		ls.add(34);
		ls.add("faizan");
		ls.add(null);
		ls.add(null);
		
		System.out.println("*************using forEach******");
		for(Object s : ls) {
			System.out.println(s);
		}
		System.out.println("*************using iterator************");
		Iterator it =  ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
