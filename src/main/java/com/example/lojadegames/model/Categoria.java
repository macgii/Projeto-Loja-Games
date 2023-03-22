package com.example.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O tipo de gênero é obrigatório!")
	private String generoJogo;

	@NotBlank(message = "A classificação indicativa é obrigatória!")
	private String classificacaoJogo;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categorias")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGeneroJogo() {
		return generoJogo;
	}

	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}

	public String getClassificacaoJogo() {
		return classificacaoJogo;
	}

	public void setClassificacaoJogo(String classificacaoJogo) {
		this.classificacaoJogo = classificacaoJogo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}