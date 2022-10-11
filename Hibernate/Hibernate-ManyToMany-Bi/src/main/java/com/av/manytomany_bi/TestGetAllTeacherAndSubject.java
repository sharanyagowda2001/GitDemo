package com.av.manytomany_bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllTeacherAndSubject {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query q = em.createQuery("select t from Teacher t");
		
		List<Teacher> teacher=q.getResultList();
		
		for(Teacher t1:teacher) {
			
			System.out.println("****************************************");
			System.out.println("Teacher id:"+t1.getId());
			System.out.println("Teacher name:"+t1.getName());
			System.out.println("Teacher Salary:"+t1.getSal());		
			
			List <Subject> sub=t1.getSubjects();
			
			for(Subject s:sub) {
				System.out.println("Subject id:"+s.getId());
				System.out.println("Subject Name:"+s.getSname());
				System.out.println("Duration:"+s.getDuration());
				System.out.println("****************************************");
			}

		}
		
//		Query q = em.createQuery("select s from Teacher t");
//		
//		List<Teacher> teacher=q.getResultList();
//		
//		for(Teacher t1:teacher) {
//			
//			System.out.println("****************************************");
//			System.out.println("Teacher id:"+t1.getId());
//			System.out.println("Teacher name:"+t1.getName());
//			System.out.println("Teacher Salary:"+t1.getSal());		
//			
//			List <Subject> sub=t1.getSubjects();
//			
//			for(Subject s:sub) {
//				System.out.println("Subject id:"+s.getId());
//				System.out.println("Subject Name:"+s.getSname());
//				System.out.println("Duration:"+s.getDuration());
//				System.out.println("****************************************");
//			}
//
//		}

	}
	
	
}
