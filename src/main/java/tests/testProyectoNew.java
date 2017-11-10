package tests;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Proyecto;

public class testProyectoNew {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		Date hoy = new Date(2017-11-10);
		Date fin = new Date(2017-12-10);
		Proyecto proy = new Proyecto("Proyecto 1",hoy,fin);
		em.persist(proy);
		etx.commit();
		em.close();
	}

}
