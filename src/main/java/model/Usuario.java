package model;

import java.util.ArrayList;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;
	private String username;
	private String email;
	private String clave;
	private ArrayList<Proyecto> proyectos;
	
	
	public Usuario (String nombre, String apellido, String username, String email, String clave, ArrayList<Proyecto> proyectos) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setUsername(username);
		this.setEmail(email);
		this.setClave(clave);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
}
