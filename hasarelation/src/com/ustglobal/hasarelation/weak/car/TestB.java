package com.ustglobal.hasarelation.weak.car;

public class TestB {
	
	public static void main(String[] args) {
		
		Music q = new Music();
		System.out.println("q.cname");
		q.english();
		q.hindi();
		System.out.println("****************************");
		q.i.play();            //Has-a relation
		System.out.println(q.i.cname);
	}
}
