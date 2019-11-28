package com.ust.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
			String jpql = "update product set pname='car' where pid=101";
			Query query =  entityManager.createQuery(jpql);
	    	int i = query.executeUpdate();
	    	System.out.println(i+"row updated");
	    	entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
    	
    	
	}

}
