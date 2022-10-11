package com.av.onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestUpdateMobAndSim {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s1=em.find(Sim.class, 2);
		s1.setS_pro("newsim3");
		s1.setType("newType1");
		
		Sim s2=em.find(Sim.class, 3);
		s2.setS_pro("newSim2");
		s2.setType("newType2");
		
		List<Sim> sims=new ArrayList<Sim>();
		
		sims.add(s1);
		sims.add(s2);
		
		Mobile m=em.find(Mobile.class, 2);			
		m.setName("NewMbl2");
		m.setBrand("NewBrand2");
		
		et.begin();
		em.merge(m);
		em.merge(s1);
		em.merge(s2);
		et.commit();
		
		System.out.println("Mobile and sim updated!");
		
		
	

}
	
	
	
	
	
}
