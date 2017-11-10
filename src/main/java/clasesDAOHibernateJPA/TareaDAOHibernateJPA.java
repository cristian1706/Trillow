package clasesDAOHibernateJPA;

import clasesDAO.TareaDAO;
import model.Tarea;

public class TareaDAOHibernateJPA extends GenericDAOHibernateJPA<Tarea> implements TareaDAO{

	public TareaDAOHibernateJPA() {
		super(Tarea.class);
		// TODO Auto-generated constructor stub
	}

}
