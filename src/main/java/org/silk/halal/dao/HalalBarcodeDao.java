package org.silk.halal.dao;

import java.util.List;

import org.silk.halal.model.HalalBarcode;



public interface HalalBarcodeDao{
	public void save(HalalBarcode halalBarcode);
	public List<HalalBarcode> list();
	public void delete(Long id);
	public HalalBarcode listById(Long id);
	public HalalBarcode listByHalalNo(String halalNo);
	public HalalBarcode listByUpc(String upc);
}
