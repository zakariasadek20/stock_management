package com.stock.management.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name = "Customers")
public class Sale implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7423616716688377231L;

	@Id
	@GeneratedValue
	private long saleId;
	
	private String saleCode;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date saleDate;

	@OneToMany(mappedBy = "sale",cascade = CascadeType.ALL)
	private List<SaleRows> saleRows;
	
	public long getSaleId() {
		return saleId;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public String getSaleCode() {
		return saleCode;
	}

	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public List<SaleRows> getSaleRows() {
		return saleRows;
	}

	public void setSaleRows(List<SaleRows> saleRows) {
		this.saleRows = saleRows;
	}
	
	
	
}
