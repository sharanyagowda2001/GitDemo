package com.av.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteTeacherAndSubject {

	public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Teacher t1=em.find(Teacher.class, 1);
		
			et.begin();
			em.remove(t1);
			et.commit();
			
			System.out.println("Teacher data deleted");

		}
	
}
