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
public class CustomerOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long customerOrderId;

	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date customerOrderDate;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToMany(mappedBy = "customerOrder",cascade = CascadeType.ALL)
	private List<CustomerOrderRows> customerOderRows;
	
	
	
	public long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(long customerOderId) {
		customerOrderId = customerOderId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCustomerOrderDate() {
		return customerOrderDate;
	}

	public void setCustomerOrderDate(Date customerOderDate) {
		customerOrderDate = customerOderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<CustomerOrderRows> getCustomerOderRows() {
		return customerOderRows;
	}

	public void setCustomerOderRows(List<CustomerOrderRows> customerOderRows) {
		this.customerOderRows = customerOderRows;
	}
	
	
	
	
}
