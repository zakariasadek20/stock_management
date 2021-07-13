package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class SupplierOrderRows implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long supplierOrderRowsId;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "supplierOrderId")
	private SupplierOrder supplierOrder;
	
	public long getSupplierOrderRowsId() {
		return supplierOrderRowsId;
	}

	public void setSupplierOrderRowsId(long id) {
		supplierOrderRowsId = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public SupplierOrder getSupplierOrder() {
		return supplierOrder;
	}

	public void setSupplierOrder(SupplierOrder supplierOrder) {
		this.supplierOrder = supplierOrder;
	}
	
	
	
	
}
