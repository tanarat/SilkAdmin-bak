package org.silk.halal.dao.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.silk.halal.dao.HalalBarcodeDao;
import org.silk.halal.model.HalalBarcode;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;


public class HalalBarcodeDaoImpl implements HalalBarcodeDao{
	@SessionTarget
	Session session;
 
	@TransactionTarget
	Transaction transaction;


	@Override
	public void save(HalalBarcode halalBarcode) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(halalBarcode);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HalalBarcode> list() {
		// TODO Auto-generated method stub
		return session.createQuery("from HalalBarcode").list();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HalalBarcode listById(Long id) {
		// TODO Auto-generated method stub
		HalalBarcode halal = new HalalBarcode();
		halal = (HalalBarcode)session.get(HalalBarcode.class,id);
		return halal;
	}

	@Override
	public HalalBarcode listByHalalNo(String halalNo) {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from HalalBarcode where halal_no = :halalNo ");
		query.setParameter("halalNo", halalNo);
		List list = query.list();
		if(list==null || list.size()==0){
			return null;
		}else{
			return (HalalBarcode) list.get(0);
		}
	}
	@Override
	public HalalBarcode listByUpc(String upc) {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from HalalBarcode where barcode = :upc ");
		query.setParameter("upc", upc);
		List list = query.list();
		if(list==null || list.size()==0){
			return null;
		}else{
			return (HalalBarcode) list.get(0);
		}
	}
}
