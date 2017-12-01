package clasesDAOHibernateJPA;

import org.springframework.stereotype.Repository;

import clasesDAO.ComentarioDAO;
import model.Comentario;

@Repository
public class ComentarioDAOHibernateJPA extends GenericDAOHibernateJPA<Comentario> implements ComentarioDAO{


	public ComentarioDAOHibernateJPA() {
		super(Comentario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Comentario recuperarComentario(String comentario) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
