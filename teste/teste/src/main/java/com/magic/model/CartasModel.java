package com.magic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cartas")

public class CartasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotNull(message = "Campo obrigatório")
	public String nome;
	
	@NotNull(message = "Campo obrigatório")
	public String edição;
	
	@NotNull(message = "Campo obrigatório")
	public String idioma;
	
	@NotNull(message = "Campo obrigatório")
	public String foil;
	
	@NotNull(message = "Campo obrigatório")
	public String preço;
	
	@NotNull(message = "Campo obrigatório")
	public String quantidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdição() {
		return edição;
	}
	public void setEdição(String edição) {
		this.edição = edição;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getFoil() {
		return foil;
	}
	public void setFoil(String foil) {
		this.foil = foil;
	}
	public String getPreço() {
		return preço;
	}
	public void setPreço(String preço) {
		this.preço = preço;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}


}
