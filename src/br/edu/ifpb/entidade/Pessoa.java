package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
@NamedQuery(name = "Pessoa.getAll", query = "from Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)   //Essa notação se refere à classe Pai, Pessoa
@DiscriminatorColumn(name = "tp_pessoa", discriminatorType = DiscriminatorType.INTEGER)
public class Pessoa {

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
}
