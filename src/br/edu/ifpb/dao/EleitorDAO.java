package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;

import br.edu.ifpb.entidade.Eleitor;

public class EleitorDAO extends GenericDAO<Integer, Eleitor> {

	private static EleitorDAO instance;
	
	public static EleitorDAO getInstance() {	
		
		instance = new EleitorDAO();		
		return instance;
	}

	@Override
	public List<Eleitor> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return getAll("Eleitor.getAll");
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return Eleitor.class;
	}

	@Override
	public Eleitor find(Eleitor entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}
}