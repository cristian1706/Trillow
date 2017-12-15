package clasesDAO;

import model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public Usuario chequearAutenticacion(String usuario, String clave);

	public boolean existe(String email);

}
