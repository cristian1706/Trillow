package model;

import java.sql.Date;
import java.util.ArrayList;

import model.Usuario;

public class Tarea {
	private Integer id;
	private String titulo;
	private String descripcion;
	private Date fechaDeAsignacion;
	private Date fechaDeVencimiento;
	private ArrayList<Comentario> comentarios;
	private ArrayList<CheckItem> checklist;
	private ArrayList<Usuario> participantes;
	private ListaDeTareas listaDeTareas;
	
	public Tarea (String titulo, String descripcion, Date fechaDeAsignacion, Date fechaDeVencimiento, ArrayList<Usuario> participantes, ListaDeTareas listaDeTareas) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setFechaDeAsignacion(fechaDeAsignacion);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setParticipantes(participantes);
		this.setListaDeTareas(listaDeTareas);
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
	public Date getFechaDeAsignacion() {
		return fechaDeAsignacion;
	}
	public void setFechaDeAsignacion(Date fechaDeAsignacion) {
		this.fechaDeAsignacion = fechaDeAsignacion;
	}
	public Date getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(Date fechaDeVencimiento2) {
		this.fechaDeVencimiento = fechaDeVencimiento2;
	}
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<CheckItem> getChecklist() {
		return checklist;
	}
	public void setChecklist(ArrayList<CheckItem> checklist) {
		this.checklist = checklist;
	}
	public ArrayList<Usuario> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(ArrayList<Usuario> participantes) {
		this.participantes = participantes;
	}
	public ListaDeTareas getListaDeTareas() {
		return listaDeTareas;
	}
	public void setListaDeTareas(ListaDeTareas listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
}
