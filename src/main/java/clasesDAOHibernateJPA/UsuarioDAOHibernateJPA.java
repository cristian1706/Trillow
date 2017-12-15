package clasesDAOHibernateJPA;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import clasesDAO.UsuarioDAO;
import model.Usuario;

@Repository
public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	public Usuario chequearAutenticacion(String unUsuario, String unaClave) {
		Query q = this.getEntityManager()
				.createQuery("SELECT p FROM Usuario p WHERE p.username = :username AND p.password = :clave");
		q.setParameter("username", unUsuario);
		q.setParameter("clave", unaClave);
		@SuppressWarnings("unchecked")
		List<Usuario> resultado = (List<Usuario>) q.getResultList();
		if (resultado.size() != 0) {
			Long id = resultado.get(0).getId();
			return (this.recuperar(id)); // recupera el usuario y lo retorna
		} else {
			return null;
		}

	}

	public boolean existe(String email) {
		Query q = this.getEntityManager().createQuery("select u from Usuario u where u.email = :email");
		q.setParameter("email", email);
		List<?> users= q.getResultList();
		
		if (users.size() != 0) {
			return true;
		} else
			return false;

		}
}
