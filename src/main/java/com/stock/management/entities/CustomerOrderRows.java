package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class CustomerOrderRows implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long customerOrderRowsId;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "customerOrderId")
	private CustomerOrder customerOrder;
	
	public long getCustomerOrderRowsId() {
		return customerOrderRowsId;
	}

	public void setCustomerOrderRowsId(long id) {
		this.customerOrderRowsId = id;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOder) {
		this.customerOrder = customerOder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
}
