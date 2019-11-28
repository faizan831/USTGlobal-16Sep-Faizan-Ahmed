package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		//int[] nums = {10,20,30,40,50};
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		for(int i= 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("***************************");

		for(int i1 : nums) {
			System.out.println(i1);
		}
		System.out.println("********************");

		char[] ch = {'a','b','c','d'};
		for(int c: ch) {
			System.out.println(c);
		}

		System.out.println("*******************");
		boolean[] b = {true,false,true,true,false};


		byte[] by = {1,2,3,4,5};
		for( byte bt : by) {
			System.out.println(bt);
		}
		System.out.println("************");
		for(byte b1 = 0;b1<by.length;b1++) {
			System.out.println(b1);
		}

		System.out.println("**********************");
		double[] d = {10.5,11.3,12.3,32.7};
		for(int d1 = 0;d1<d.length;d1++) {
			System.out.println(d[d1]);
		}
	}
}

