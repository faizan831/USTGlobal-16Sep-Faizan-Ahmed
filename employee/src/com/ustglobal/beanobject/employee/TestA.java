package com.ustglobal.beanobject.employee;



public class TestA {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(111);
		e.setName("Lochan");
		e.setSalary(1200000);
		e.setDept(420);
		e.setDesignation("CEO");
		
		DataBase db = new DataBase();
		db.receive(e);
		
		db.save(e);
	}
}
