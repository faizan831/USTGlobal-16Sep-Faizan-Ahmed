package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("shareef");
		hs.add("faizan");
		hs.add("lochan");
		hs.add("amit");
		hs.add("jason");
		
		System.out.println("*************using forEach******");
		for(String s : hs) {
			System.out.println(s);
		}
		System.out.println("*************using iterator************");
		Iterator<String> it =  hs.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
	}
}
