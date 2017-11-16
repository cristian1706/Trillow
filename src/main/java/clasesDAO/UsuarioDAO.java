package clasesDAO;

import model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public Usuario persistir(Usuario user);
	
	public Usuario actualizar(Usuario user);
		
	public Usuario borrar(Long id);
	
	public Usuario recuperar(Long id);

}
