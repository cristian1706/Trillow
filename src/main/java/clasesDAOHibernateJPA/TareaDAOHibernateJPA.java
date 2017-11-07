package clasesDAOHibernateJPA;

import clasesDAO.TareaDAO;
import model.Tarea;

public class TareaDAOHibernateJPA extends GenericDAOHibernateJPA<Tarea> implements TareaDAO{

	public TareaDAOHibernateJPA(Class<Tarea> class1) {
		super(class1);
		// TODO Auto-generated constructor stub
	}

}
