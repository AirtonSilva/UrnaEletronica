package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.edu.ifpb.entidade.Eleitor;
import br.edu.ifpb.hibernate.HibernateUtil;

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
	
	public Eleitor getByTitulo(String titulo) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Eleitor eleitor = null;
		
		try {
			
			String hql = "from Eleitor as a"
					+ " where a.tt_pessoa = :titulo";
			
			Query query = session.createQuery(hql);
			query.setParameter("titulo", titulo);
			
			eleitor = (Eleitor) query.uniqueResult();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
		} finally {
		
			session.close();
		}
		
		return eleitor;
	}
	
}