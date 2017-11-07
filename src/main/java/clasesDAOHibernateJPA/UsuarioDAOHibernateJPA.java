package clasesDAOHibernateJPA;

import clasesDAO.UsuarioDAO;
import model.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	@Override
	public Usuario recuperarUsuario(String usario) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
