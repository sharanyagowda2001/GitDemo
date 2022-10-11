package com.av.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.av.dto.Mobile;
import com.av.dto.Sim;

public abstract class TestSaveMobileAndSim {

	public static void main(String[] args) {
		
		Sim s1=new Sim();
		s1.setS_pro("idea");
		s1.setType("3g");
		
		Sim s2=new Sim();
		s2.setS_pro("vodafone");
		s2.setType("5g");
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);
		
		Mobile m=new Mobile();
		m.setBrand("XiaoMi");
		m.setName("mi a3");
		
		m.setS(list);
		
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
