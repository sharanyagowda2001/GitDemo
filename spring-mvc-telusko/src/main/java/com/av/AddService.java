
package com.av;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;

public class AddService {
	public int add(int i, int j) {
// EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("lathesh");
// EntityManager entityManager=entityManagerFactory.createEntityManager();
// EntityTransaction entityTransaction=entityManager.getTransaction();
// Addition addition=new Addition();
// addition.setFirstNumber(i);
// addition.setSecondNumber(j);
		int result = i + j;
// addition.setResult(result);
// entityTransaction.begin();
// entityManager.persist(addition);
// entityTransaction.commit();
		return i + j;
	}
}
