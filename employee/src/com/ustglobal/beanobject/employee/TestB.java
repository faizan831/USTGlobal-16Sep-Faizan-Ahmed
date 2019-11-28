package com.ustglobal.beanobject.employee;

import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		
		System.out.println("Scanner class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		String name = sc.nextLine();
		System.out.println("Name is "+ name);
		double salary = sc.nextDouble();
		System.out.println("Salary is "+ salary);
		
	}
}
