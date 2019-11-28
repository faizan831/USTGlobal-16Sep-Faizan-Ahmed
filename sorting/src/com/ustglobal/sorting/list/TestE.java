package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {

		ArrayList<Pen> al = new ArrayList<>();

		Pen s1 = new Pen(70.3 , "shAReef");
		Pen s2 = new Pen(50.4 ,  "FaiZan");
		Pen s3  = new Pen(35.1, "lochAn");
		Pen s4  = new Pen(40.8 ,"aMit");
		Pen s5 = new Pen(54.8 , "Jason");

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		System.out.println("Before sorting-----");
		displayPenDetails(al);
		
		System.out.println("After sorting------");
		displayPenDetails(al);
	}
	static void displayPenDetails(ArrayList<Pen> al) {

		Iterator<Pen> it = al.iterator();
		while(it.hasNext()) {
			Pen s = it.next();
			
			System.out.println("price of pen "+s.price);
			System.out.println("Brand of pen "+s.brand);
			System.out.println("-------------------------------");
		}
	}

}
