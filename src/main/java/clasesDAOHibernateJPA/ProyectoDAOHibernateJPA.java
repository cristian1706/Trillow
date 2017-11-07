package clasesDAOHibernateJPA;

import clasesDAO.ProyectoDAO;
import model.Proyecto;

public class ProyectoDAOHibernateJPA extends GenericDAOHibernateJPA<Proyecto> implements ProyectoDAO{

	public ProyectoDAOHibernateJPA(Class<Proyecto> class1) {
		super(class1);
		// TODO Auto-generated constructor stub
	}

}
