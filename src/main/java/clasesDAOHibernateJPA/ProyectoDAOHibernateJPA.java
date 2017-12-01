package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.ProyectoDAO;
import model.Proyecto;

@Repository
public class ProyectoDAOHibernateJPA extends GenericDAOHibernateJPA<Proyecto> implements ProyectoDAO{

	public ProyectoDAOHibernateJPA() {
		super(Proyecto.class);
		// TODO Auto-generated constructor stub
	}

}
