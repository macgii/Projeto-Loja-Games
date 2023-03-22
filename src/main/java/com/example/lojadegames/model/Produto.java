package com.example.lojadegames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;

	@NotBlank(message = "O nome do jogo é obrigatótio!")
	private String nomeJogo;

	@NotBlank(message = "A marca do jogo é obrigatória!")
	private String marcaJogo;

	@NotBlank(message = "O console do jogo é obrigatório!")
	private String consoleJogo;

	private String descricaoJogo;

	@NotNull
	private BigDecimal precoJogo;

	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getMarcaJogo() {
		return marcaJogo;
	}

	public void setMarcaJogo(String marcaJogo) {
		this.marcaJogo = marcaJogo;
	}

	public String getConsoleJogo() {
		return consoleJogo;
	}

	public void setConsoleJogo(String consoleJogo) {
		this.consoleJogo = consoleJogo;
	}

	public String getDescricaoJogo() {
		return descricaoJogo;
	}

	public void setDescricaoJogo(String descricaoJogo) {
		this.descricaoJogo = descricaoJogo;
	}

	public BigDecimal getPrecoJogo() {
		return precoJogo;
	}

	public void setPrecoJogo(BigDecimal precoJogo) {
		this.precoJogo = precoJogo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
