package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1011, "shareef");
		ht.put(508, "lochan");
		ht.put(1533, "faizan");
		ht.put(1124, "amit");
	//	ht.put(null, "rafi");NullPointerException ,no null for key 
	//	ht.put(108, null);-------------//-------  ,no null for value
		
		System.out.println("Data "+ht);
		
	}

}
