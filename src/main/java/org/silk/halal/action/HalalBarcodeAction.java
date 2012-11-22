package org.silk.halal.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.ServletActionContext;
import org.silk.entrepreneur.dao.EntrepreneurDao;
import org.silk.entrepreneur.dao.impl.EntrepreneurDaoImpl;
import org.silk.entrepreneur.model.Entrepreneur;
import org.silk.halal.dao.HalalBarcodeDao;
import org.silk.halal.dao.impl.HalalBarcodeDaoImpl;
import org.silk.halal.model.HalalBarcode;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class HalalBarcodeAction extends ActionSupport implements ModelDriven<HalalBarcode>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HalalBarcode halalBarcode = new HalalBarcode();
	private List<HalalBarcode> halalBarcodeList = new ArrayList<HalalBarcode>();
	private HalalBarcodeDao dao = new HalalBarcodeDaoImpl();
	private EntrepreneurDao entrepreneurDao = new EntrepreneurDaoImpl();

	private String barcodeSearch;
	private Long ownerId;
	Map<Long,Entrepreneur> companyList = new LinkedHashMap<Long, Entrepreneur>(); ;
	public HalalBarcodeAction(){

	}
	
	

//	public Map<Long, String> getCompanyList() {
//		return companyList;
//	}
//
//
//
//	public void setCompanyList(Map<Long, String> companyList) {
//		this.companyList = companyList;
//	}



	public Map<Long, Entrepreneur> getCompanyList() {
		List<Entrepreneur> list = entrepreneurDao.list();
		for (Entrepreneur entrepreneur : list) {
			companyList.put(entrepreneur.getId(), entrepreneur);
		}
		return companyList;
	}



	public void setCompanyList(Map<Long, Entrepreneur> companyList) {
		this.companyList = companyList;
	}



	@Override
	public HalalBarcode getModel() {
		// TODO Auto-generated method stub
		return halalBarcode;
	}
	
	public String save(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		ownerId = Long.parseLong(request.getParameter("companySelected"));
		System.out.println("Owner id : " + ownerId);
		Entrepreneur owner = entrepreneurDao.listById(ownerId);
		halalBarcode.setOwner(owner);
		dao.save(halalBarcode);
		return SUCCESS;
	}
	
	public String list(){
		halalBarcodeList = dao.list();
		return SUCCESS;
	}
	public String delete(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		dao.delete(Long.parseLong(request.getParameter("id")));
		return SUCCESS;
	}
	
	public String search(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		barcodeSearch = request.getParameter("barcode");
		if(barcodeSearch!=null && barcodeSearch.length()==12){
			halalBarcode = dao.listByHalalNo(barcodeSearch);
		}else if(barcodeSearch!=null && barcodeSearch.length()==13){
			halalBarcode = dao.listByUpc(barcodeSearch);
		}else{
//			halalBarcode = new HalalBarcode();
			halalBarcode = null;
		}
		if(halalBarcode == null){
			return ERROR;
		}
		return SUCCESS;
	}
	/*
	 * To get single record by Id
	 */
	public String edit(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String id = request.getParameter("id");
		if(id!=null){
			halalBarcode = dao.listById(Long.parseLong(request.getParameter("id")));
		}else{
			halalBarcode = new HalalBarcode();
		}
		
		return SUCCESS;
	}

	public HalalBarcode getHalalBarcode() {
		return halalBarcode;
	}

	public void setHalalBarcode(HalalBarcode halalBarcode) {
		this.halalBarcode = halalBarcode;
	}

	public List<HalalBarcode> getHalalBarcodeList() {
		return halalBarcodeList;
	}

	public void setHalalBarcodeList(List<HalalBarcode> halalBarcodeList) {
		this.halalBarcodeList = halalBarcodeList;
	}



	public String getBarcodeSearch() {
		return barcodeSearch;
	}



	public void setBarcodeSearch(String barcodeSearch) {
		this.barcodeSearch = barcodeSearch;
	}
	
}
