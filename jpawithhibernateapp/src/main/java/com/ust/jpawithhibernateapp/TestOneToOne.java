package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.onetoone.Person;
import com.ust.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("faizan");
		
		Person p = new Person();
		p.setPid(1);
		p.setPname("faizan");
		p.setVoterCard(vc);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			VoterCard vCard = entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPname());
//			entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		}
	}
