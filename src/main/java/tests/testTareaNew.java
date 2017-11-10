package tests;

import java.util.List;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Comentario;
import model.ListaDeTareas;
import model.Tarea;
import model.Usuario;

public class testTareaNew {
	
	public static void  main(String arg[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		//Creo una tarea y la persisto
		//Creo un usuario y una lista de tareas
		Usuario user = new Usuario("maria","cercato","mcercato","mcercato@hotmail","123456");
		em.persist(user);
		ListaDeTareas tasklist = new ListaDeTareas("Lista 1");
		em.persist(tasklist);
		em.flush();
		Integer idTaskList = tasklist.getId();
		ArrayList<Integer> users = new ArrayList<Integer>();
		users.add(user.getId());
		Date hoy = new Date(2017-11-10);
		Date fin = new Date(2017-12-10);
		Tarea task = new Tarea("Tarea 1","Realizar la primer tarea",hoy,fin,users,idTaskList);
		em.persist(task);
		List<Tarea> tareas=(List<Tarea>)(em.createQuery("from modelo.Tarea t where t.id = idTaskList")).getResultList();
		for (Tarea tar:tareas) {
			System.out.println("Titulo: "+tar.getTitulo()+" Descripción: " +tar.getDescripcion());
			
		}
		
		etx.commit();
		em.close();
	}

}
