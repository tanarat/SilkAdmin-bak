package org.silk.halal.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.silk.SessionFactoryHelper;
import org.silk.halal.dao.HalalBarcodeDao;
import org.silk.halal.model.HalalBarcode;

public class ProductDaoImpl implements HalalBarcodeDao {
	private SessionFactory sessionFactory;
	private Session session;
	
	public ProductDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public void save(HalalBarcode halalBarcode) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<HalalBarcode> list() {
		// TODO Auto-generated method stub
		
		List<HalalBarcode> list = session.createQuery("from HalalBarcode").list();
		
		return list;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public HalalBarcode listById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HalalBarcode listByHalalNo(String halalNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HalalBarcode listByUpc(String upc) {
		// TODO Auto-generated method stub
		return null;
	}

}
