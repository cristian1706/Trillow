package tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Usuario;


public class testUsuario {
	
	public static void main(String args[]){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		//Creo un usuario y lo persisto
		Usuario user = new Usuario("maria","cercato","mcercato","mcercato@hotmail","123456");
		em.persist(user);

		etx.commit();
		em.close();
		
	}

}
