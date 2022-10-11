package com.av.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherAndSubject {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Teacher t=em.find(Teacher.class, 2);			
		t.setName("NewTeacher2");
		t.setSal("44000");
		
		Subject s1=em.find(Subject.class, 1);
		s1.setSname("newSub");
		s1.setDuration(1);
		
		Subject s2=em.find(Subject.class, 2);
		s2.setSname("newSub2");
		s2.setDuration(2);
		
		List<Subject> subs=new ArrayList<Subject>();
		subs.add(s1);
		subs.add(s2);
		
//		Teacher t=em.find(Teacher.class, 2);			
//		t.setName("NewTeacher2");
//		t.setSal("45678");
		
		et.begin();
		em.merge(t);
		em.merge(s1);
		em.merge(s2);
		et.commit();
		
		System.out.println("Teacher and subject updated!");
	}
	
	
	
	
}
