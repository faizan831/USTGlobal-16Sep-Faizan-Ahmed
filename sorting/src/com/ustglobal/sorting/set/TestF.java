package com.ustglobal.sorting.set;
import java.util.Iterator;
import java.util.TreeSet;
public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts =  new TreeSet<String>();
		ts.add("shareef");
		ts.add("faizan");
		ts.add("lochan");
		ts.add("amit");
		ts.add("jason");
		
		System.out.println("*************using forEach******");
		for(String s : ts) {
			System.out.println(s);
		}
		System.out.println("*************using iterator************");
		Iterator<String> it =  ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
	}

}
