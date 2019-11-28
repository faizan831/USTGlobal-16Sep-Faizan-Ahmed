package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		//                                 set doesnot preserve insertion order,
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("shareef");
		hs.add(58.7);
		hs.add(12);// duplicates are not allowed
		hs.add(null);
		hs.add(null);//multiple null are not allowed
		
		System.out.println("*****************Using for each*******************");
		for(Object o : hs) {
			System.out.println(o);
		}
		System.out.println("**********Using iterator*********");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
