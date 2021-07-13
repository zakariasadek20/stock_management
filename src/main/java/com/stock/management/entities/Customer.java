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
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7423616716688377231L;

	@Id
	@GeneratedValue
	private long customerId;

	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String picture;
	
	private String email;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<CustomerOrder> customerOrders;
	
	public Customer() {
		
	}
	
	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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


	public List<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}


	public void setCustomerOrders(List<CustomerOrder> customerOders) {
		this.customerOrders = customerOders;
	}
	
	
	
}
