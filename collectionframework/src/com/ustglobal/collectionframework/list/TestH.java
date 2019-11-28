package com.ustglobal.collectionframework.list;

import java.util.ListIterator;
import java.util.Vector;

public class TestH {
public static void main(String[] args) {
	
	Vector li =new Vector();
	li.add(12);
	li.add(77.7);
	li.add("faizan");
	li.add(true);
	li.add(null);
	
	System.out.println("-----using for loop------");
	for(int i = 0;i<li.size();i++) {
		System.out.println(li.get(i));
	}
	
	System.out.println("----------=using for each---------");
	for(Object object : li) {
		System.out.println(object);
	}
	
	System.out.println("-----------------------using iterator-------------");
	ListIterator lt =li.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);
	}
	System.out.println("----------List iterator backword---");
	while(lt.hasPrevious()) {
		Object o = lt.previous();
		System.out.println(o);
	}
}
}
