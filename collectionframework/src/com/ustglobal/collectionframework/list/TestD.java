package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.8);
		al.add("yesh");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("-------->forward");
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		System.out.println("---------backword");
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
