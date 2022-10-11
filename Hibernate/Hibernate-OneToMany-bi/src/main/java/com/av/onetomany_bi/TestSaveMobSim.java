package com.av.onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobSim {

	public static void main(String[] args) {
		
		Sim s1=new Sim();
		s1.setS_pro("Airtel");
		s1.setType("8g");
		
		Sim s2=new Sim();
		s2.setS_pro("idene");
		s2.setType("3g");
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);
		
		Mobile m=new Mobile();
		m.setBrand("Oppo");
		m.setName("fg10");
		
		m.setS(list);
		
		s1.setM(m);
		s2.setM(m);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(m);
		et.commit();
		

	}

}
