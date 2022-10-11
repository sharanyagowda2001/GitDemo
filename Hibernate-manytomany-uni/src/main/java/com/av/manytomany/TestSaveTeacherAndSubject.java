package com.av.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacherAndSubject {

	public static void main(String[] args) {
	
		Subject s1=new Subject();
		s1.setSname("JAVA");
		s1.setDuration(2);

		Subject s2=new Subject();
		s2.setSname("C++");
		s2.setDuration(4);
		
		Subject s3=new Subject();
		s3.setSname("C");
		s3.setDuration(3);
		
		List<Subject> list1=new ArrayList<Subject>();
		list1.add(s1);
		list1.add(s3);
		
		Teacher t1=new Teacher();
		t1.setName("Sharan pais");
		t1.setSal("45000");
		t1.setSubjects(list1);
		
		List<Subject> list2=new ArrayList<Subject>();
		list2.add(s2);
		list2.add(s3);
		
		Teacher t2=new Teacher();
		t2.setName("Pradeep v");
		t2.setSal("40000");
		t2.setSubjects(list2);
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sharu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(t1);
		em.persist(t2);
		et.commit();
		
	}

}
