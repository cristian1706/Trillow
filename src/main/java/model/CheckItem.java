package model;

import javax.persistence.*;

@Entity
@Table(name="checkItem")

public class CheckItem {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_checkItem")
	private Long id;
	
	private String texto;
	private Boolean estado;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id_tarea")
	private Tarea tarea;
	
	public CheckItem() {
		
	}
	
	
	public CheckItem(String texto, Boolean estado) {
		this.setTexto(texto);
		this.setEstado(estado);
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
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
