package org.silk.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.silk.halal.dao.HalalBarcodeDao;
import org.silk.halal.dao.impl.HalalBarcodeDaoImpl;
import org.silk.halal.dao.impl.ProductDaoImpl;
import org.silk.halal.model.HalalBarcode;

@Path("/products")
public class HalalProductService {
	
	List<HalalBarcode> productList = new ArrayList<HalalBarcode>();
	HalalBarcodeDao productDao = new ProductDaoImpl();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<HalalBarcode> getProducts(){
		productList = productDao.list();
		return productList;
	}
	
	
}
