package com.ustglobal.beanobject.employee;

public class DataBase {


	void receive(Employee s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());

	}
	void save(Employee e) {
		System.out.println("-----------Im database");
		System.out.println("id is " +e.getId());
		System.out.println("Name ia "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Dept is "+e.getDept());
		System.out.println("Designation is "+e.getDesignation());
		
	}
}