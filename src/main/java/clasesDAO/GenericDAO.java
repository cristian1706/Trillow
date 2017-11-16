package clasesDAO;


public interface GenericDAO<T> {
	public T actualizar(T entity);

	public void borrar(T entity);

	public T borrar(Long id);

	public boolean existe(Long id);

	public T persistir(T entity);

	public T recuperar(Long id);
}