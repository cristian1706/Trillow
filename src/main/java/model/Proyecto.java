package model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "proyecto")

public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_proyecto")
	private Long id;

	private String titulo;
	private String descripcion;
	private String fechaDeCreacion;
	private String fechaDeFinalizacion;

	@ManyToMany(mappedBy="proyectos")
	private Collection<Usuario> miembros;

	@OneToMany(mappedBy="proyecto")
	private Collection<ListaDeTareas> listaDeTareas;

	public Proyecto() {

	}

	public Proyecto(String titulo, String fechaDeCreacion, String fechaDeFinalizacion) {
		this.setTitulo(titulo);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setFechaDeFinalizacion(fechaDeFinalizacion);
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

	public String getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(String fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public Collection<Usuario> getMiembros() {
		return miembros;
	}

	public void setMiembros(Collection<Usuario> miembros) {
		this.miembros = miembros;
	}

	public Collection<ListaDeTareas> getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(Collection<ListaDeTareas> listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}

}
