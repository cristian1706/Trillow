package tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Comentario;
import model.Usuario;

public class testComentario {
	
	public static void main(String args[]){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
				//Creo un mensaje y lo persisto
		Comentario comen = new Comentario();
		comen.setTexto("Soy un comentario");
		comen.setId_usuario(1);
		em.persist(comen);
		//si ahora hiciéramos m.setTexto(“Otro texto”); este cambio también sería persistido
		//Obtengo todos los mensajes
		List<Comentario> comentarios=(List<Comentario>)(em.createQuery("from modelo.Comentario")).getResultList();
		List<Usuario> usuarios=(List<Usuario>)(em.createQuery("from modelo.Usuario")).getResultList();
		for (Comentario com:comentarios) {
			for (Usuario user:usuarios) {
				if(com.getId_usuario()==user.getId()) {
					System.out.println("Usuario: "+user.getUsername()+" Comentario : " +com.getTexto());
				}
			}
		}
		etx.commit();
		em.close();
		
	}

}
