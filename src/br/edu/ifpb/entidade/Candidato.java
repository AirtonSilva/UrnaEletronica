package br.edu.ifpb.entidade;

import javax.persistence.Column;
import br.edu.ifpb.entidade.Pessoa;

public class Candidato extends Pessoa{

	@Column(name = "partido_candidato")
	private String partido;
	
	@Column(name = "num_candidato")
	private int numero;
	
	@Column(name = "categoria_candidato")
	private String categoria;

	
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
