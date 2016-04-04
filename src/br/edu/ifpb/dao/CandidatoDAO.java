package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;

import br.edu.ifpb.entidade.Candidato;

public class CandidatoDAO extends GenericDAO<Integer, Candidato> {

	private static CandidatoDAO instance;
	
	public static CandidatoDAO getInstance() {	
		
		instance = new CandidatoDAO();		
		return instance;
	}

	@Override
	public List<Candidato> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return getAll("Candidato.getAll");
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return Candidato.class;
	}

	@Override
	public Candidato find(Candidato entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}
}