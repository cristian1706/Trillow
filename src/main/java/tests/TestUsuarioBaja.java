package tests;


import clasesDAO.UsuarioDAO;
import clasesDAOHibernateJPA.DAOFactory;

public class TestUsuarioBaja {

	public static void main(String[] args) {
		DAOFactory fac = new DAOFactory();
		UsuarioDAO user = fac.getUsuarioDAO();
		Long num = new Long(2); 
		user.borrar(num);
	}

}
