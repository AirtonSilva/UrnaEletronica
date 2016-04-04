package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_candidato")
@NamedQuery(name = "Candidato.getAll", query = "from Candidato")
@DiscriminatorValue(value = "1") 	//Identificador para tabela Candidato
public class Candidato extends Pessoa {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private Integer id;
	
	@Column(name = "ptd_candidato")
	private String partido;
	
	@Column(name = "num_candidato")
	private String numero;
		
	@Column(name = "ctg_candidato")
	private String categoria;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
