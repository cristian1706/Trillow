package model;

import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.*;

import model.Usuario;

@Entity
@Table(name="tarea")

public class Tarea {
	@Id @GeneratedValue
	@Column(name="tarea_id")

	private Integer id;
	private String titulo;
	private String descripcion;
	private Date fechaDeAsignacion;
	private Date fechaDeVencimiento;
	private ArrayList<Integer> comentarios;
	private ArrayList<Integer> checklist;
	private ArrayList<Integer> participantes;
	private Integer idListaDeTareas;
	
	public Tarea (String titulo, String descripcion, Date fechaDeAsignacion, Date fechaDeVencimiento, ArrayList<Integer> participantes, Integer idListaDeTareas) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setFechaDeAsignacion(fechaDeAsignacion);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setParticipantes(participantes);
		this.setIdListaDeTareas(idListaDeTareas);
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

	public void setFechaDeVencimiento(Date fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	
	public ArrayList<Integer> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Integer> comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<Integer> getChecklist() {
		return checklist;
	}

	public void setChecklist(ArrayList<Integer> checklist) {
		this.checklist = checklist;
	}

	public ArrayList<Integer> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Integer> participantes) {
		this.participantes = participantes;
	}

	public Integer getIdListaDeTareas() {
		return idListaDeTareas;
	}

	public void setIdListaDeTareas(Integer idListaDeTareas) {
		this.idListaDeTareas = idListaDeTareas;
	}
	
	

}
