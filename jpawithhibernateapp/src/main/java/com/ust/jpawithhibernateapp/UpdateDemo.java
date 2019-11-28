package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.product;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		product product = entityManager.find(product.class, 101);
		product.setPname("mobile");
		System.out.println("Updated record ");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();	
	}

}
