package model;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="usuario")

public class Usuario {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Long id;
	
	private String nombre;
	private String apellido;
	private String username;
	private String email;
	private String clave;
	
	@ManyToMany
	@JoinTable(name="usuario_proyecto", joinColumns=@JoinColumn(name="id_usuario", referencedColumnName="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_proyecto", referencedColumnName="id_proyecto"))
	private Collection<Proyecto> proyectos;
	
	
	@OneToMany(mappedBy="usuario")
	private Collection<Comentario> comentarios;
	
	@ManyToMany
	@JoinTable(name="usuario_tarea", joinColumns=@JoinColumn(name="id_usuario", referencedColumnName="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_tarea", referencedColumnName="id_tarea"))
	private Collection<Tarea> tareas;
	
	
	public Usuario() {
		
	}
	
	public Usuario (String nombre, String apellido, String username, String email, String clave) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setUsername(username);
		this.setEmail(email);
		this.setClave(clave);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Collection<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(Collection<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
}
