package com.ust.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.jdbc.PerConnectionLRUFactory;
import com.ust.jpawithhibernateapp2.dto.Product2;

public class InsertNew {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Product2 product = new Product2();
		product.setPid(102);
		product.setPname("bag");
		product.setPquantity(15);
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record Saved");
		entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}

}
