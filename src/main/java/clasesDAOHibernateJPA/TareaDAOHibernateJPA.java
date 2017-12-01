package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.TareaDAO;
import model.Tarea;

@Repository
public class TareaDAOHibernateJPA extends GenericDAOHibernateJPA<Tarea> implements TareaDAO{

	public TareaDAOHibernateJPA() {
		super(Tarea.class);
		// TODO Auto-generated constructor stub
	}

}
