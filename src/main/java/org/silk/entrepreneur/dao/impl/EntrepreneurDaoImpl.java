package org.silk.entrepreneur.dao.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.silk.entrepreneur.dao.EntrepreneurDao;
import org.silk.entrepreneur.model.Entrepreneur;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class EntrepreneurDaoImpl implements EntrepreneurDao {
	@SessionTarget
	Session session;
 
	@TransactionTarget
	Transaction transaction;
	@Override
	public void save(Entrepreneur entrepreneur) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(entrepreneur);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entrepreneur> list() {
		// TODO Auto-generated method stub
		return session.createQuery("from Entrepreneur").list();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Entrepreneur listById(Long id) {
		// TODO Auto-generated method stub
		Entrepreneur entrepreneur = new Entrepreneur();
		entrepreneur = (Entrepreneur)session.get(Entrepreneur.class, id);
		return entrepreneur;
	}

}
