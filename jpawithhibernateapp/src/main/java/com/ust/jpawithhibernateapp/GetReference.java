package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.product;

public class GetReference {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
//		 entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
		product product = entityManager.getReference(product.class, 101);
//		product product = entityManager.find(product.class, 101);
		System.out.println(product.getClass());
//		System.out.println(product.getPid());
//		System.out.println(product.getPname());
//		System.out.println(product.getQuality());
		
		
		entityManager.close();	
	}//end of main
}
