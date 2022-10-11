package com.av.onetomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllMobSim {
	
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
//		
//		Query q = em.createQuery("select m from Mobile m");
//		
//		List<Mobile> mobiles=q.getResultList();
//		
//		for(Mobile mobile:mobiles) {
//			System.out.println("****************************************");
//			System.out.println("Mobile id:"+mobile.getId());
//			System.out.println("Mobile brand:"+mobile.getBrand());
//			System.out.println("Mobile name:"+mobile.getName());
//			System.out.println("****************************************");
//			
//			
//			List <Sim> sims=mobile.getS();
//			
//			for(Sim sim:sims) {
//					System.out.println("Sim id:"+sim.getId());
//					System.out.println("Sim Service provider:"+sim.getS_pro());
//					System.out.println("sim Type:"+sim.getType());
//					System.out.println("****************************************");
//			}
//			
//		}
//		
		
		Query q = em.createQuery("select s from Sim s");
		
		List<Sim> sims=q.getResultList();
		
		for(Sim sim:sims) {
			System.out.println("****************************************");
			System.out.println("Sim id:"+sim.getId());
			System.out.println("Sim Service provider:"+sim.getS_pro());
			System.out.println("sim Type:"+sim.getType());
			System.out.println("****************************************");
			
			
			Mobile mobile=sim.getM();
			
			if(mobile!=null) {
					
					System.out.println("****************************************");
					System.out.println("Mobile id:"+mobile.getId());
					System.out.println("Mobile brand:"+mobile.getBrand());
					System.out.println("Mobile name:"+mobile.getName());
					System.out.println("****************************************");
			}
		
		
	}

  }
}
