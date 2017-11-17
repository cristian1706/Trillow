package model;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="listaDeTareas")

public class ListaDeTareas {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_listaDeTareas")
	private Long id;
	private String titulo;
	
	@OneToMany(mappedBy="listaDeTareas")
	private Collection<Tarea> tareas;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_proyecto")
	private Proyecto proyecto;

	
	public ListaDeTareas() {
		
	}
	
	
	public ListaDeTareas(String titulo) {
		super();
		this.titulo = titulo;
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
	
	public Collection<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(Collection<Tarea> tareas) {
		this.tareas = tareas;
	}
}
