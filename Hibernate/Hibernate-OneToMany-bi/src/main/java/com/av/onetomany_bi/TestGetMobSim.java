package com.av.onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestGetMobSim {

public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		
		Mobile m=em.find(Mobile.class, 1);
		
		if(m!=null) {
			System.out.println("****************************************");
			System.out.println("Mobile id:"+m.getId());
			System.out.println("Mobile brand:"+m.getBrand());
			System.out.println("Mobile name:"+m.getName());
			System.out.println("****************************************");
		}
		
		List<Sim> list=m.getS();
	
		for(Sim s:list) {
			System.out.println("Sim id:"+s.getId());
			System.out.println("Sim Service provider:"+s.getS_pro());
			System.out.println("sim Type:"+s.getType());
			System.out.println("****************************************");
		}
	
	}
	
	
	
}
