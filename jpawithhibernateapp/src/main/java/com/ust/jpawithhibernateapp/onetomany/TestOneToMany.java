package com.ust.jpawithhibernateapp.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.onetoone.Person;
import com.ust.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToMany {
	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Doms");
		
		Pencil p = new Pencil();
		p.setPid(11);
		p.setColor("black");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(12);
		p1.setColor("red");
		p1.setPencilBox(pb);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);
			
			
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
