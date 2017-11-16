package model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name="tarea")

public class Tarea {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tarea")
	private Long id;
	
	private String titulo;
	private String descripcion;
	private Date fechaDeAsignacion;
	private Date fechaDeVencimiento;
	
	@OneToMany(mappedBy="tarea")
	private Collection<Comentario> comentarios;
	
	@OneToMany(mappedBy="tarea")
	private Collection<CheckItem> checklist;
	
	@ManyToMany(mappedBy="tareas")
	private Collection<Usuario> participantes;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_listaDeTareas")
	private ListaDeTareas listaDeTareas;
		
	public Tarea() {
		
	}
	
	
	public Tarea (String titulo, String descripcion, Date fechaDeAsignacion, Date fechaDeVencimiento, Collection<Usuario> participantes, ListaDeTareas listaDeTareas) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setFechaDeAsignacion(fechaDeAsignacion);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setParticipantes(participantes);
		this.setListaDeTareas(listaDeTareas);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public Collection<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Collection<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Collection<CheckItem> getChecklist() {
		return checklist;
	}

	public void setChecklist(Collection<CheckItem> checklist) {
		this.checklist = checklist;
	}

	public Collection<Usuario> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Collection<Usuario> participantes) {
		this.participantes = participantes;
	}

	public ListaDeTareas getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(ListaDeTareas listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
	
	

}
