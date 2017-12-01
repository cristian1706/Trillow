package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.UsuarioDAO;
import model.Usuario;

@Repository
public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
