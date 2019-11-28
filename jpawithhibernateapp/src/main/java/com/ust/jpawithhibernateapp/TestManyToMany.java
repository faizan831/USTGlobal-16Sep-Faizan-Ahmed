package com.ust.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.manytomany.Course;
import com.ust.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCid(10);
		course.setCname("java");
		
		Course course2 = new Course();
		course2.setCid(20);
		course2.setCname("sql");
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course);
		alCourses.add(course2);
		
		Student student= new Student();
		student.setSid(1);
		student.setSname("faizan");
		student.setCourse(alCourses);
	
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			System.out.println("Record saved");
			entityManager.persist(student);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
