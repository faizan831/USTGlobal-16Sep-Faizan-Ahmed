package com.ust.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpawithhibernateapp.dto.product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		String jpql = "from product";
//		Query query =  entityManager.createQuery(jpql);
//		query.getResultList();
//		List<product> list = query.getResultList();
//		for (product product : list) {
//			System.out.println(product.getPid());
//			System.out.println(product.getPname());
//			System.out.println(product.getQuality());
//		}
		String jpql = "select pname from product";
		Query query =  entityManager.createQuery(jpql);
    	query.getResultList();
		List<String> list = query.getResultList();
		for (String product : list) {
			System.out.println(product);
		}
		entityManager.close();
		
	}//end of main

}
