package com.dr.pojo;

import java.text.DateFormat;
import java.util.Date;

public class Store {

	private int import_id;
	private int store_id;
	private int drug_id;
	private String drug_name;
	private Date import_date;
	private double remain_num;
	private String supply;
	private String unit;
	private String location;
	public int getImport_id() {
		return import_id;
	}
	public void setImport_id(int import_id) {
		this.import_id = import_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getDrug_id() {
		return drug_id;
	}
	public void setDrug_id(int drug_id) {
		this.drug_id = drug_id;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public String getImport_date() {
		String formatDate = DateFormat.getDateInstance().format(import_date);
		return formatDate;
	}
	public void setImport_date(Date import_date) {
		this.import_date = import_date;
	}
	public double getRemain_num() {
		return remain_num;
	}
	public void setRemain_num(double remain_num) {
		this.remain_num = remain_num;
	}
	public String getSupply() {
		return supply;
	}
	public void setSupply(String supply) {
		this.supply = supply;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	
	
}