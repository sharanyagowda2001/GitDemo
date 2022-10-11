package com.av.onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteMobAndSim {

public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile m=em.find(Mobile.class, 1);
		
		List<Sim> sim=m.getS();
		
		et.begin();
		
		for(Sim s:sim) {
			em.remove(s);
			
		}
		
		em.remove(m);
		
		et.commit();
		
		System.out.println("Mobile and sim data deleted");

	}
	
	
	
	
	
}
