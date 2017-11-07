package model;

public class CheckItem {
	private Integer id;
	private String texto;
	private Boolean estado;
	
	public CheckItem(String texto, Boolean estado) {
		this.setTexto(texto);
		this.setEstado(estado);
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
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
