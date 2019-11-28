package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.jdbc.PerConnectionLRUFactory;
import com.ust.jpawithhibernateapp.dto.product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		product productDetail = entityManager.find(product.class, 101);
		System.out.println("ID="+productDetail.getPid());
		System.out.println("Name -"+productDetail.getPname());
		System.out.println("Quality-"+productDetail.getQuality());
	}//end of main

}
