package br.edu.ifpb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.entidade.Candidato;

@RequestScoped
@ManagedBean
public class PessoaBean{
	
	private Candidato candidato = new Candidato();
	
	public Candidato getCandidato() {
		return candidato;
	}
	

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public String cadastrarcandidato(){
		System.out.println(candidato.getNome());
		System.out.println(candidato.getEndereco());
		System.out.println(candidato.getCpf());
		System.out.println(candidato.getRg());
		System.out.println(candidato.getTitulo());
		System.out.println(candidato.getPartido());
		System.out.println(candidato.getNumero());
		System.out.println(candidato.getCategoria());
		
		return this.cadastrarcandidato();
	}

}
