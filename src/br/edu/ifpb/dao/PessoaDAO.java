package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;

import br.edu.ifpb.entidade.Pessoa;

public class PessoaDAO extends GenericDAO<Integer, Pessoa> {

	private static PessoaDAO instance;
	
	public static PessoaDAO getInstance() {		
		
		instance = new PessoaDAO();		
		return instance;
	}

	@Override
	public List<Pessoa> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return getAll("Pessoa.getAll");
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return Pessoa.class;
	}

	@Override
	public Pessoa find(Pessoa entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}
}