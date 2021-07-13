package com.stock.management.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "Customers")
public class Supplier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7423616716688377231L;

	@Id
	@GeneratedValue
	private long supplierId;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String picture;
	
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	private List<SupplierOrder> supplierOrders;
	
	public Supplier() {
		
	}
	
	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<SupplierOrder> getSupplierOrders() {
		return supplierOrders;
	}

	public void setSupplierOrders(List<SupplierOrder> supplierOders) {
		this.supplierOrders = supplierOders;
	}
	
	
	
}
