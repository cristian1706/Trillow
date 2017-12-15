package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.ListaDeTareasDAO;
import model.ListaDeTareas;

@Repository
public class ListaDeTareasDAOHibernateJPA extends GenericDAOHibernateJPA<ListaDeTareas> implements ListaDeTareasDAO{

	public ListaDeTareasDAOHibernateJPA() {
		super(ListaDeTareas.class);
		// TODO Auto-generated constructor stub
	}
}
