package clasesDAO;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T> {
	public T modificar(T entity);

	public T eliminar(T entity);

	public T eliminar(Serializable id);

	public T persistir(T entity);

	public T recuperar(Long id);
	
	public List<T> recuperarTodos();
}