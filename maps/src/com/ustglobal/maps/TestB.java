package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		hm.put("shareef", 990867);
		hm.put("faizan", 987653);
		hm.put("lochan", 789789);
		
		HashMap hm1 = new HashMap();
		hm1.put("ghazan", 987540);
		hm1.put("rafi", 768590);
		hm1.put("rumu", 342187);
		
		boolean hasKey = hm.containsKey("shareef");
		System.out.println("Has Key "+hasKey);
		System.out.println("=================================");
		
		boolean hasValue = hm.containsValue("654687");
		System.out.println("Has Value "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("map is Empty "+isEmpty);
		hm.clear();
		System.out.println("After clearing "+hm);
		
}

}
