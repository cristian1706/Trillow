package model;

public class Comentario {
	private Integer id;
	private String texto;
	private Usuario usuario;

	public Comentario(String texto, Usuario usuario) {
		this.setTexto(texto);
		this.setUsuario(usuario);
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
