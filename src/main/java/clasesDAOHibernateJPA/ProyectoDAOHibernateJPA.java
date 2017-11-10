package clasesDAOHibernateJPA;

import clasesDAO.ProyectoDAO;
import model.Proyecto;

public class ProyectoDAOHibernateJPA extends GenericDAOHibernateJPA<Proyecto> implements ProyectoDAO{

	public ProyectoDAOHibernateJPA() {
		super(Proyecto.class);
		// TODO Auto-generated constructor stub
	}

}
