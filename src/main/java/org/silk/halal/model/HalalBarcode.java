package org.silk.halal.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.silk.entrepreneur.model.Entrepreneur;
@XmlRootElement
public class HalalBarcode {
	private Long id;
	private String upc = "";
	private String halalNo = "";
	private String productName = "";
	private int halalFromMonth;
	private int halalFromYear;
	private int halalToMonth;
	private int halalToYear;
	private String halalValidTo="";
	private Entrepreneur owner;
	
	public HalalBarcode() {
		super();
	}
	public HalalBarcode(String upc, String halalNo, String productName) {
		super();
		this.upc = upc;
		this.halalNo = halalNo;
		this.productName = productName;
	}
	
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getHalalNo() {
		return halalNo;
	}
	public void setHalalNo(String halalNo) {
		this.halalNo = halalNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "HalalBarcode [upc=" + upc + ", halalNo=" + halalNo
				+ ", productName=" + productName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Entrepreneur getOwner() {
		return owner;
	}
	public void setOwner(Entrepreneur owner) {
		this.owner = owner;
	}
	public int getHalalFromMonth() {
		return halalFromMonth;
	}
	public void setHalalFromMonth(int halalFromMonth) {
		this.halalFromMonth = halalFromMonth;
	}
	public int getHalalFromYear() {
		return halalFromYear;
	}
	public void setHalalFromYear(int halalFromYear) {
		this.halalFromYear = halalFromYear;
	}
	public int getHalalToMonth() {
		return halalToMonth;
	}
	public void setHalalToMonth(int halalToMonth) {
		this.halalToMonth = halalToMonth;
	}
	public int getHalalToYear() {
		return halalToYear;
	}
	public void setHalalToYear(int halalToYear) {
		this.halalToYear = halalToYear;
	}
	public String getHalalValidTo() {
		switch(halalToMonth){
		case 1: halalValidTo += "มกราคม";break;
		case 2: halalValidTo += "กุมภาพันธ์";break;
		case 3: halalValidTo += "มีนาคม";break;
		case 4: halalValidTo += "เมษายน";break;
		case 5: halalValidTo += "พฤษภาคม";break;
		case 6: halalValidTo += "มิถุนายน";break;
		case 7: halalValidTo += "กรกฎาคม";break;
		case 8: halalValidTo += "สิงหาคม";break;
		case 9: halalValidTo += "กันยายน";break;
		case 10: halalValidTo += "ตุลาคม";break;
		case 11: halalValidTo += "พฤศจิกายน";break;
		case 12: halalValidTo += "ธันวาคม";break;
		}
		return halalValidTo + " "+ halalToYear;
//		return halalToMonth + "/" + halalToYear;
	}
	public void setHalalValidTo(String halalValidTo) {
		this.halalValidTo = halalValidTo;
	}
	
}
