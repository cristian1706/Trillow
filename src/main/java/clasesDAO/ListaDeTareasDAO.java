package clasesDAO;

import model.ListaDeTareas;

public interface ListaDeTareasDAO extends GenericDAO<ListaDeTareas> {
	
	public ListaDeTareas recuperarListaDeTareas(String ListaDeTareas);

}
