package br.edu.ifpb.bean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.dao.VotoDAO;
import br.edu.ifpb.entidade.Candidato;
import br.edu.ifpb.entidade.Eleitor;
import br.edu.ifpb.entidade.Voto;

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

	public void exibirMsgCandidato() throws IOException {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Êxito", "Candidato(a) cadastrado(a) com sucesso.");
        RequestContext.getCurrentInstance().showMessageInDialog(message);
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }
	
	public void exibirMsgEleitor() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Êxito", "Eleitor(a) cadastrado(a) com sucesso.");
        RequestContext.getCurrentInstance().showMessageInDialog(message);
        
    }
	
	public void verificarTitulo() throws SQLException, IOException{
		EleitorDAO eleitorDAO = new EleitorDAO();
		Eleitor val_eleitor = eleitorDAO.getByTitulo(eleitor.getTitulo());
		
		VotoDAO votoDAO = new VotoDAO();
		List<Voto> voto_aux = votoDAO.getByVoto(val_eleitor.getId());
			
		if((val_eleitor!=null)&&(voto_aux.size()==0)){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", val_eleitor);
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else{
			System.out.println("É nulo");
		}
	}

}
