package br.edu.ifpb.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.entidade.Candidato;
import br.edu.ifpb.entidade.Eleitor;

@RequestScoped
@ManagedBean
public class PessoaBean{
	
	private Candidato candidato = new Candidato();
	private Eleitor eleitor = new Eleitor();
		
	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public Candidato cadastrarcandidato() throws SQLException {
		
		CandidatoDAO.getInstance().insert(candidato);
		
		return candidato;
				
	}
	
	public Eleitor cadastrareleitor() throws SQLException {
		
		System.out.println(eleitor.getNome());
		System.out.println(eleitor.getEndereco());
		System.out.println(eleitor.getCpf());
		System.out.println(eleitor.getRg());
		System.out.println(eleitor.getTitulo());
		
		EleitorDAO.getInstance().insert(eleitor);
		
		return eleitor;
				
	}

}
