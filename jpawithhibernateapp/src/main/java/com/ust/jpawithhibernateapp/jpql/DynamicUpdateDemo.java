package com.ust.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateDemo {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "update product set pname=:name where pid=:id";
			Query query =  entityManager.createQuery(jpql);
	    	 query.setParameter("name", "book");
	    	 query.setParameter("id", 101);
	    	int i = query.executeUpdate();
	    	System.out.println(i+" row updated");
	    	entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
    	
    	
	}


}
