package com.ustglobal.sorting.set;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	
	SortByName sb = new SortByName();
	SortByPincode sp = new SortByPincode();
	SortByMICR sm = new SortByMICR();
	TreeSet<Bank> ts = new TreeSet<Bank>(sp);//(sb);(sm);
	Bank b1 = new Bank("HDFC",560068,6768689);
	Bank b2 = new Bank("SBI", 560071,7668979);
	Bank b3 = new Bank("CITI",560054,6859767);
	Bank b4 = new Bank("CANARA",560078,757687);
	Bank b5 = new Bank("CANARA",560078,757687);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	System.out.println("***********Using iteratot******");
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b = it.next();
		System.out.println("Name is "+b.name);
		System.out.println("pincode is "+b.pincode);
		System.out.println("micr is "+b.micr);
		System.out.println("============================");
	}
	
	
}
}
