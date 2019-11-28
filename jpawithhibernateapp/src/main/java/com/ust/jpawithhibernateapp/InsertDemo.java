package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.EntityManagerMessageLogger;

import com.ust.jpawithhibernateapp.dto.product;

public class InsertDemo {

	public static void main(String[] args) {
		product product = new product();
		product.setPid(102);
		product.setPname("milk");
		product.setQuality(5);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}//end of main
}
