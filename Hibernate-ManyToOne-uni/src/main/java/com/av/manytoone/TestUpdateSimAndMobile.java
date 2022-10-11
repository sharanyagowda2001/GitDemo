package com.av.manytoone;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestUpdateSimAndMobile {

	public static void main(String[] args) {
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Mobile m= em.find(Mobile.class,1);
			m.setName("NewMbl");
			m.setBrand("NewBrand");
			
			Sim s1=em.find(Sim.class, 2);
			s1.setS_pro("newsim1");
			s1.setType("newType1");
			
			Sim s2=em.find(Sim.class, 1);
			s2.setS_pro("newSim2");
			s2.setType("newType2");
					
			et.begin();
			em.merge(s1);
			em.merge(s2);
			em.merge(m);
			et.commit();
			
			System.out.println("Mobile and sim updated!");
			

	}

}
