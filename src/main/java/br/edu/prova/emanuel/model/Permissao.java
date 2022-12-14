package br.edu.prova.emanuel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Permissao {
	
	@Id
	private Integer idPermissao;
	
	private String papel;
	
	@ManyToOne
	private Usuario usuario;

	public Integer getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Integer idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
