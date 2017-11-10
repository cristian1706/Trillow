package clasesDAOHibernateJPA;

import clasesDAO.CheckItemDAO;
import model.CheckItem;

public class CheckItemDAOHibernateJPA extends GenericDAOHibernateJPA<CheckItem> implements CheckItemDAO {

	public CheckItemDAOHibernateJPA() {
		super(CheckItem.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CheckItem recuperarCheckItem(String CheckItem) {
		// TODO Auto-generated method stub
		return null;
	}

}
