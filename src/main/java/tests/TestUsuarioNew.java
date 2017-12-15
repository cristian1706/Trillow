package tests;


import clasesDAO.UsuarioDAO;
import clasesDAOHibernateJPA.DAOFactory;
import clasesDAOHibernateJPA.UsuarioDAOHibernateJPA;
import model.Usuario;


public class TestUsuarioNew {
	
	public static void main(String args[]){
		
		DAOFactory fac = new DAOFactory();
		UsuarioDAO user = fac.getUsuarioDAO();
		Usuario u = new model.Usuario("cristian","barreto","cbarreto","cbarreto@hotmail","123456");
		u = user.persistir(u);
		Usuario us = new model.Usuario("maria","cercato","mcercato","mcercato@hotmail","123456");
		us = user.persistir(us);

	}
}
