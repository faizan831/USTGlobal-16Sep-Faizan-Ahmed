package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestP {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(34);
		ts.add(45);
		ts.add(9);
		ts.add(39);
		//ts.add("shareef"); classCasteException
		//ts.add("null"); nullPointerException
		System.out.println("*************using forEach******");
		for(Object s : ts) {
			System.out.println(s);
		}
		System.out.println("*************using iterator************");
		Iterator it =  ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}

}
