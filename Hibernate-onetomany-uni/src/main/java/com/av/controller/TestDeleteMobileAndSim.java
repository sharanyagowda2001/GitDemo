package com.av.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.av.dto.Mobile;
import com.av.dto.Sim;

public class TestDeleteMobileAndSim {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile m=em.find(Mobile.class, 5);
	
		et.begin();
		em.remove(m);
		
		et.commit();
		
		System.out.println("Mobile data deleted");

	}

}
