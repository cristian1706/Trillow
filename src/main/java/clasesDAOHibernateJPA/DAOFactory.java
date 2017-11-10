package clasesDAOHibernateJPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clasesDAO.ProyectoDAO;
import clasesDAO.TareaDAO;
import clasesDAO.UsuarioDAO;
import clasesDAO.CheckItemDAO;
import clasesDAO.ListaDeTareasDAO;
import clasesDAO.ComentarioDAO;

public class DAOFactory {
	
	
	public UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
	}
	public ProyectoDAO getProyectoDAO() {
		return new ProyectoDAOHibernateJPA();
	}
	public TareaDAO getTareaDAO() {
		return new TareaDAOHibernateJPA();
	}
	public ListaDeTareasDAO getListaDeTareasDAO() {
		return new ListaDeTareasDAOHibernateJPA();
	}
	public ComentarioDAO getComentarioDAO() {
		return new ComentarioDAOHibernateJPA();
	}
	public CheckItemDAO getCheckItemDAO() {
		return new CheckItemDAOHibernateJPA();
	}
	
	
}
