package tests;

import clasesDAO.ProyectoDAO;
import clasesDAO.UsuarioDAO;
import clasesDAOHibernateJPA.DAOFactory;
import model.Proyecto;
import model.Usuario;

public class testProyectoNew {

	public static void main(String[] args) {
		
		DAOFactory fac = new DAOFactory();
		ProyectoDAO proj = fac.getProyectoDAO();
		UsuarioDAO user = fac.getUsuarioDAO();
		Long num = new Long(1);
		Usuario u = user.recuperar(num);
		String hoy = "2017-11-10";
		String fin = "2017-12-10";
		String des = "Descripcion";
		Proyecto proy = new Proyecto("Proyecto 1",hoy,fin);
		proy.setDescripcion(des);
		proy = proj.persistir(proy);
		
		

		
	}

}
