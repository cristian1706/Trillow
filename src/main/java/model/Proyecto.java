package model;

import java.sql.Date;
import java.util.ArrayList;

public class Proyecto {
	private Integer id;
	private String titulo;
	private String descripcion;
	private Date fechaDeCreacion;
	private Date fechaDeFinalizacion;
	private ArrayList<Usuario> miembros;
	private ArrayList<ListaDeTareas> listaDeTareas;
	
	public Proyecto (String titulo, Date fechaDeCreacion, Date fechaDeFinalizacion) {
		this.setTitulo(titulo);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setFechaDeFinalizacion(fechaDeFinalizacion);
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public Date getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}
	public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}
	public ArrayList<Usuario> getMiembros() {
		return miembros;
	}
	public void setMiembros(ArrayList<Usuario> miembros) {
		this.miembros = miembros;
	}
	public ArrayList<ListaDeTareas> getListaDeTareas() {
		return listaDeTareas;
	}
	public void setListaDeTareas(ArrayList<ListaDeTareas> listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
}
