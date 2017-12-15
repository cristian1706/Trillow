package clasesDAOHibernateJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import clasesDAO.GenericDAO;

@Transactional
public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {
	
	protected Class<T> persistent;
	
	private EntityManager entityManager;

	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.entityManager = em;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public GenericDAOHibernateJPA(Class<T> persistent) {
		this.persistent = persistent;
	}
	
	
	public T persistir(T entity) {
		this.getEntityManager().persist(entity);
		return entity;
	}
	
	public T modificar(T entity) {
		T entity2 = this.getEntityManager().merge(entity);
		return entity2;
	}
	
	public T eliminar(T entity) {
			this.getEntityManager().remove(entity);
			return entity;
	}
	
	public List<T> recuperarTodos() {
	//	Query consulta=EMFactory.getEMF().createEntityManager().find(this.getPersistent()); 
		
		Query consulta = this.getEntityManager().createQuery("select e from " + getPersistent().getSimpleName()+ " e");
		@SuppressWarnings("unchecked")
		List<T> resultado = (List<T>) consulta.getResultList();
		if (resultado.size() != 0) {
			return resultado;
		} else {
			return null;
		}
	}
	
	public T eliminar(Serializable id) {
		T entity = this.getEntityManager().find(this.getPersistent(), id);
		this.eliminar(entity);
		return entity;
	}
	
	public T recuperar(Long id) {
		T entity = this.getEntityManager().find(this.getPersistent(), id);
		return entity;
	}

	
	public Class<T> getPersistent() {
		return persistent;
	}

	public void setPersistent(Class<T> persistent) {
		this.persistent = persistent;
	}

}
