package model;

import javax.persistence.*;

@Entity
@Table(name="comentario")

public class Comentario {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_comentario")
	private Long id;
	
	private String texto;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_tarea")
	private Tarea tarea;
	
	public Comentario() {
	}

	public Comentario(String texto, Usuario usuario) {
		this.setTexto(texto);
		this.setUsuario(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
