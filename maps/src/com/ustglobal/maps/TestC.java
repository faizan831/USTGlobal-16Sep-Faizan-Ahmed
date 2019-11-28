package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bangalore", 560068);
		lh.put("ckm", 577101);
		lh.put("aldur", 577111);
		
		System.out.println(lh);
		Set<String>s = lh.keySet();
		for(String Key : s ) {
			System.out.println("Key "+Key);
		}
		
		System.out.println("=======================================");
		
		Collection<Integer> c = lh.values();
		for(Integer value : c) {
			System.out.println("Value "+value);
		}
		
		System.out.println(lh);
		
	}
}
