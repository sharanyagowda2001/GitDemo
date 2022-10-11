package com.av.onetomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetSimMob {

public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction et=em.getTransaction();
		
		Sim s=em.find(Sim.class, 1);
		
		if(s!=null)
		
		{
			
			System.out.println("****************************************");
			System.out.println("Sim id:"+s.getId());
			System.out.println("Sim Provider:"+s.getS_pro());
			System.out.println("Sim type:"+s.getType());
			System.out.println("****************************************");
		}
			
			Mobile m=s.getM();
			
			if(m!=null) {
				System.out.println("Mobile id:"+m.getId());
				System.out.println("Mobile Brand"+m.getBrand());
				System.out.println("Mob name:"+m.getName());
				System.out.println("****************************************");
			}
	}
}
	
	
	
	

