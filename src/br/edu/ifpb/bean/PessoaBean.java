package br.edu.ifpb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.dao.PessoaDAO;
import br.edu.ifpb.entidade.Candidato;
import br.edu.ifpb.entidade.Pessoa;

@RequestScoped
@ManagedBean
public class PessoaBean{
	
	private Candidato candidato = new Candidato();
	private String nome;
	private Candidato cadastrarcandidato;
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = PessoaDAO.getInstance().getAll();
		
		for (Pessoa candidato: pessoas) {
			System.out.println(candidato.getNome());
		}
		
	}
	
	public Candidato getCandidato() {
		
		if (candidato == null){
			candidato = new Candidato();
		}
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Candidato getCadastrarcandidato() {
		return cadastrarcandidato;
	}

	public void setCadastrarcandidato(Candidato cadastrarcandidato) {
		this.cadastrarcandidato = cadastrarcandidato;
	}
	
	public String cadastrarcandidato(){
		
		candidato.setNome(nome);
		System.out.println(candidato.getNome());
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
