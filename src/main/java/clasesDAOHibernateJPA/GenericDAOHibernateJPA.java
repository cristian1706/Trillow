package clasesDAOHibernateJPA;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import clasesDAO.GenericDAO;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class<T> class1) {
		this.persistentClass = class1;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T actualizar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		entity = em.merge(entity);
		etx.commit();
		em.close();
		return entity;

	}

	@Override
	public void borrar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.contains(entity) ? entity : em.merge(entity));
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}

	}

	@Override
	public T borrar(Long id) {
		T entity = EMF.getEMF().createEntityManager().find(this.getPersistentClass(), id);
		
		if (entity != null) {
			this.borrar(entity);
		}
		return entity;
	}

	@Override
	public boolean existe(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}
		return entity;

	}

	@Override
	public T recuperar(Long id) {
		T entity = EMF.getEMF().createEntityManager().find(this.getPersistentClass(), id);
		return entity;
	}
	
	public List<?> recuperarTodos(String columnOrder) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery("select e from " + getPersistentClass().getSimpleName()+" e order by e."+columnOrder);
		List<?> resultado = (List<?>)consulta.getResultList();
		return resultado;
		}


}
