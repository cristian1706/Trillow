package tests;

import clasesDAO.UsuarioDAO;
import clasesDAOHibernateJPA.DAOFactory;
import model.Usuario;

public class TestUsuarioShow {
	public static void main(String args[]){
		
		DAOFactory fac = new DAOFactory();
		UsuarioDAO user = fac.getUsuarioDAO();
		Long num = new Long(1);
		Usuario u = user.recuperar(num);
		System.out.println("Usuario: "+u.getUsername());
		System.out.println("Email: "+u.getEmail());
	}

}
