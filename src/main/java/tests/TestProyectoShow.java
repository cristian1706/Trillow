package tests;

import clasesDAO.ProyectoDAO;
import clasesDAOHibernateJPA.DAOFactory;
import model.Proyecto;

public class TestProyectoShow {
	public static void main(String[] args) {
		
		DAOFactory fac = new DAOFactory();
		ProyectoDAO proj = fac.getProyectoDAO();
		Long id = 1l;
		Proyecto proy = proj.recuperar(id);
		System.out.println("Titulo: "+proy.getTitulo());
		System.out.println("Descripcion: "+proy.getDescripcion());
		System.out.println("Fecha Creacion: "+proy.getFechaDeCreacion());
		System.out.println("Fecha fin: "+proy.getFechaDeFinalizacion());
		

		
	}
}
