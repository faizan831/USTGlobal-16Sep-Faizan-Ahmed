package com.ustglobal.beanobject.bean;

public class Student {
	
	private int id;
	private String name;
	private int rollno;
	
	public Student() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public int getRollNo() {
		return rollno;
	}
}
