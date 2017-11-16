package clasesDAOHibernateJPA;

import clasesDAO.UsuarioDAO;
import model.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
