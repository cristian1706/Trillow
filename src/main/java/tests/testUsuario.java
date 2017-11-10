package tests;


import clasesDAO.UsuarioDAO;
import clasesDAOHibernateJPA.DAOFactory;
import model.Usuario;


public class testUsuario {
	
	public static void main(String args[]){
		
		DAOFactory fac = new DAOFactory();
		UsuarioDAO user = fac.getUsuarioDAO();
		Usuario u = new Usuario("maria","cercato","mcercato","mcercato@hotmail","123456");
		u = user.persistir(u);
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("trillow");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		//Creo un usuario y lo persisto
		Usuario user = new Usuario("maria","cercato","mcercato","mcercato@hotmail","123456");
		em.persist(user);

		etx.commit();
		em.close();
		*/
	}

}
