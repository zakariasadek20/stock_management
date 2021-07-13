package com.stock.management.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SupplierOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long supplierOrderId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date supplierOrderDate;
	
	@ManyToOne
	@JoinColumn(name = "supplierId")
	private Supplier supplier;
	
	
	@OneToMany(mappedBy = "supplierOrder" ,cascade =  CascadeType.ALL)
	private List<SupplierOrderRows> supplierOrderRows;
	
	public long getSupplierOrderId() {
		return supplierOrderId;
	}

	public void setSupplierOrderId(long supplierOderId) {
		supplierOrderId = supplierOderId;
	}


	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<SupplierOrderRows> getSupplierOrderRows() {
		return supplierOrderRows;
	}

	public void setSupplierOrderRows(List<SupplierOrderRows> supplierOrderRows) {
		this.supplierOrderRows = supplierOrderRows;
	}

	public Date getSupplierOrderDate() {
		return supplierOrderDate;
	}

	public void setSupplierOrderDate(Date supplierOrderDate) {
		this.supplierOrderDate = supplierOrderDate;
	}
	
	
	
	
}
