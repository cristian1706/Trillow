package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.ListaDeTareas;

public class testListadeTareasNew {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		
		ListaDeTareas tasklist = new ListaDeTareas("Lista 1");
		em.persist(tasklist);
		
		etx.commit();
		em.close();
	}

}
