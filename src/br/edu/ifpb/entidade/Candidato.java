package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "candidato")
@NamedQuery(name = "Candidato.getAll", query = "from Candidato")
public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_candidato")
	private int id;
	
	@Column(name = "nm_candidato")
	private String nome;

	@Column(name = "end_candidato")
	private String endereco;
	
	@Column(name = "cpf_candidato")
	private String cpf;
		
	@Column(name = "rg_candidato")
	private String rg;
	
	@Column(name = "tt_candidato")
	private String titulo;
	
	@Column(name = "ptd_candidato")
	private String partido;
	
	@Column(name = "num_candidato")
	private String numero;
		
	@Column(name = "ctg_candidato")
	private String categoria;

	
	public Candidato() {		
		this.nome = "";
		this.endereco = " ";
		this.cpf = "";
		this.rg = " ";
		this.titulo = " ";
		this.partido = " ";
		this.numero = " ";
		this.categoria = " ";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
