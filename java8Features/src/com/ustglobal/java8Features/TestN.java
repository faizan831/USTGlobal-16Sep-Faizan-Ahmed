package com.ustglobal.java8Features;

import java.util.ArrayList;

public class TestN {
	public static void main(String[] args) {
		
		ArrayList<Student> al =  new ArrayList<Student>();
		al.add(new Student(5, "faizan",84.9));
		al.add(new Student(3, "shareef",87.9));
		al.add(new Student(6, "lochan",35.4));
		al.add(new Student(2, "amit",42.9));
		al.add(new Student(1, "jason",28.9));
		
		Healper h = new Healper();
		//h.displayAllStudent(al);
		//h.displayFailedStudents(al);
		//h.displayPassedStudents(al);
		h.displayTopperStudent(al);
	}

}
