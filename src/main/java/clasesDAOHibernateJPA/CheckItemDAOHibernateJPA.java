package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.CheckItemDAO;
import model.CheckItem;

@Repository
public class CheckItemDAOHibernateJPA extends GenericDAOHibernateJPA<CheckItem> implements CheckItemDAO {

	public CheckItemDAOHibernateJPA() {
		super(CheckItem.class);
		// TODO Auto-generated constructor stub
	}

}
