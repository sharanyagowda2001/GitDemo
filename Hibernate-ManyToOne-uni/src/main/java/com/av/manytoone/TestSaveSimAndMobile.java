package com.av.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSaveSimAndMobile {

	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.setBrand("MI");
		m.setName("POCO");
	
			Sim s1=new Sim();
			s1.setS_pro("Bsnl");
			s1.setType("4g");
			s1.setM(m);
			
			Sim s2=new Sim();
			s2.setS_pro("Vi");
			s2.setType("8g");	
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
