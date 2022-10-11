package com.av.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetSimAndMobile {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s1=em.find(Sim.class, 2);
		
		if(s1!=null) {
			System.out.println("****************************************");
			System.out.println("Sim id:"+s1.getId());
			System.out.println("Sim provider:"+s1.getS_pro());
			System.out.println("Sim type:"+s1.getType());
			System.out.println("****************************************");
		}
		
		Mobile m=s1.getM();
		if(m!=null)
		{
			System.out.println("Mobile id:"+m.getId());
			System.out.println("Mobile Brand:"+m.getBrand());
			System.out.println("Mobile Name:"+m.getName());
			System.out.println("****************************************");
		}
	
	}
	
	
	
}
