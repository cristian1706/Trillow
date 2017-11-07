package clasesDAOHibernateJPA;

import clasesDAO.ComentarioDAO;
import model.Comentario;

public class ComentarioDAOHibernateJPA extends GenericDAOHibernateJPA<Comentario> implements ComentarioDAO{


	public ComentarioDAOHibernateJPA(Class<Comentario> class1) {
		super(class1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Comentario recuperarComentario(String comentario) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
