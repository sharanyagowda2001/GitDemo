package com.av.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestDeleteSimAndMobile {
	
	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s1=em.find(Sim.class, 4);
	
		et.begin();
		em.remove(s1);
		et.commit();
		
		System.out.println("Sim data deleted");

	}
	
	
}
