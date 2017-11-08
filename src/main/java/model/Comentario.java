package model;

import javax.persistence.*;

@Entity
@Table(name="Comentario")

public class Comentario {
	
	@Id @GeneratedValue
	@Column(name="id_comentario")
	
	private Integer id;
	private String texto;
	private Integer id_usuario;
	
	public Comentario() {
	}

	public Comentario(String texto, Integer id_usuario) {
		this.setTexto(texto);
		this.setId_usuario(id_usuario);
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


}
