package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
@NamedQuery(name = "Pessoa.getAll", query = "from Pessoa")
public class Pessoa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private int id;
	
	@Column(name = "nm_pessoa")
	private String nome;
	
	@Column(name = "end_pessoa")
	private String endereco;
	
	@Column(name = "cpf_pessoa")
	private int cpf;
	
	@Column(name = "rg_pessoa")
	private int rg;
	
	@Column(name = "tit_pessoa")
	private int titulo;
	
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
	
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	
	public int getTitulo(){
		return titulo;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
