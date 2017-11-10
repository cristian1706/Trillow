package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.CheckItem;

public class testCheckItemNew {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		
		CheckItem ci = new CheckItem("Primer Item",false);
		em.persist(ci);
		
		etx.commit();
		em.close();
		
	}

}
