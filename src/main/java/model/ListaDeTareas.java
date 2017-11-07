package model;

import java.util.ArrayList;

public class ListaDeTareas {
	private Integer id;
	private String titulo;
	private ArrayList<Tarea> tareas;

	public ListaDeTareas(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
}
