package org.silk.halal.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.silk.halal.bo.HalalBarcodeBo;
import org.silk.halal.dao.HalalBarcodeDao;
import org.silk.halal.model.HalalBarcode;

public class HalalBarcodeBoImpl implements HalalBarcodeBo{
	HalalBarcodeDao halalBarcodeDao;
	
	public HalalBarcodeDao getHalalBarcodeDao() {
		return halalBarcodeDao;
	}

	public void setHalalBarcodeDao(HalalBarcodeDao halalBarcodeDao) {
		this.halalBarcodeDao = halalBarcodeDao;
	}

	public HalalBarcodeBoImpl() {
		super();
	}

	@Override
	public void addHalalBarcode(HalalBarcode halalBarcode) {
		// TODO Auto-generated method stub
//		System.out.println("add halalBarcode to list....");
//		halalBarcodeDao.addHalalBarcode(halalBarcode);
	}

	@Override
	public List<HalalBarcode> listHalalBarcode() {
		// TODO Auto-generated method stub
//		return halalBarcodeDao.listHalalBarcode();
		return null;
	}

}
