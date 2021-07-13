package com.stock.management.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name = "CustomerOders")
public class MvtStk implements Serializable {

	public static final int ENTREE = 1;
	public static final int SORTIE = 2;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long mvtStkId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date mvtStkDate;

	private BigDecimal quantity;

	private int mvtStkType;
	
	@ManyToOne
	@JoinColumn(name ="productId" )
	private Product product;

	public long getMvtStkId() {
		return mvtStkId;
	}

	public void setMvtStkId(long id) {
		this.mvtStkId = id;
	}

	public Date getMvtStkDate() {
		return mvtStkDate;
	}

	public void setMvtStkDate(Date mvtStkDate) {
		this.mvtStkDate = mvtStkDate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public int getMvtStkType() {
		return mvtStkType;
	}

	public void setMvtStkType(int mvtStkType) {
		this.mvtStkType = mvtStkType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
