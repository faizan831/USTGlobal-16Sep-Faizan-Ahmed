package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		hm.put("shareef", 990867);
		hm.put("faizan", 987653);
		hm.put("lochan", 789789);
		hm.put(null, null);
		hm.put(null, null);
		
		System.out.println("Data "+hm);
		hm.put("faizan", 242323);
		
		System.out.println("After modify "+hm);
		hm.put("amit", 990867);
		
		System.out.println("After amit "+hm);
		
		System.out.println("After null "+hm);
		System.out.println("=========================");
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		Object phoneno = hm.get("shareef");
		System.out.println(phoneno);
		
		Object phonno1 =hm.get("she");
		System.out.println(phonno1);
		
		Object value = hm.remove("lochan");
		System.out.println(value);
		
		System.out.println("After removing"+hm);
		
	}

}
