package clasesDAOHibernateJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import clasesDAO.GenericDAO;

@Transactional
public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

	protected Class<T> persistentClass;
	private EntityManager entityManager;

	public GenericDAOHibernateJPA(Class<T> class1) {
		this.persistentClass = class1;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public T actualizar(T entity) {
		entity = this.getEntityManager().merge(entity);
		return entity;
	}

	@Override
	public void borrar(T entity) {
		this.getEntityManager().remove(entity);
	}

	@Override
	public T borrar(Long id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		this.borrar(entity);
		return entity;
	}

	@Override
	public boolean existe(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		this.getEntityManager().persist(entity);
		return entity;

	}

	@Override
	public T recuperar(Long id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		return entity;
	}

	public List<?> recuperarTodos(String columnOrder) {
		Query consulta = EMF.getEMF().createEntityManager()
				.createQuery("select e from " + getPersistentClass().getSimpleName() + " e order by e." + columnOrder);
		List<?> resultado = (List<?>) consulta.getResultList();
		return resultado;
	}

}
