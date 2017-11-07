package clasesDAOHibernateJPA;

import clasesDAO.ListaDeTareasDAO;
import model.ListaDeTareas;

public class ListaDeTareasDAOHibernateJPA extends GenericDAOHibernateJPA<ListaDeTareas> implements ListaDeTareasDAO{

	public ListaDeTareasDAOHibernateJPA(Class<ListaDeTareas> class1) {
		super(class1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ListaDeTareas recuperarListaDeTareas(String ListaDeTareas) {
		// TODO Auto-generated method stub
		return null;
	}

}
