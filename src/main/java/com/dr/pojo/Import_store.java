package com.dr.pojo;

import java.util.Date;

public class Import_store {

	private int importId;
	private int importPrice;
	private double importNum;
	private double importAmount;
	private String supply;
	private String transman;
	private int drugId;
	private Date importDate;
	private String location;
	public int getImportId() {
		return importId;
	}
	public void setImportId(int importId) {
		this.importId = importId;
	}
	public int getImportPrice() {
		return importPrice;
	}
	public void setImportPrice(int importPrice) {
		this.importPrice = importPrice;
	}
	public double getImportNum() {
		return importNum;
	}
	public void setImportNum(double importNum) {
		this.importNum = importNum;
	}
	public double getImportAmount() {
		return importAmount;
	}
	public void setImportAmount(double importAmount) {
		this.importAmount = importAmount;
	}
	public String getSupply() {
		return supply;
	}
	public void setSupply(String supply) {
		this.supply = supply;
	}
	public String getTransman() {
		return transman;
	}
	public void setTransman(String transman) {
		this.transman = transman;
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public Date getImportDate() {
		return importDate;
	}
	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Import_store [importId=" + importId + ", importPrice=" + importPrice + ", importNum=" + importNum
				+ ", importAmount=" + importAmount + ", supply=" + supply + ", transman=" + transman + ", drugId="
				+ drugId + ", importDate=" + importDate + ", location=" + location + "]";
	}
	
	

	
}
