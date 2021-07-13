package com.stock.management.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "products")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2881914597967452739L;

	@Id
	@GeneratedValue
	private long productId;

	private String productCode;

	private String productDesignation;

	private BigDecimal unitPriceHT;

	// taux TVA
	private BigDecimal productTaxValue;

	private BigDecimal unitPriceTTC;

	private String picture;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<CustomerOrderRows> customerOrderRows;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<SupplierOrderRows> supplierOrderRows;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<SaleRows> saleRows;
	
	@OneToMany(mappedBy = "product")
	private List<MvtStk> mvtStks;
	
	public Product() {
		
	}
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesignation() {
		return productDesignation;
	}

	public void setProductDesignation(String productDesignation) {
		this.productDesignation = productDesignation;
	}

	public BigDecimal getUnitPriceHT() {
		return unitPriceHT;
	}

	public void setUnitPriceHT(BigDecimal unitPriceHT) {
		this.unitPriceHT = unitPriceHT;
	}

	public BigDecimal getProductTaxValue() {
		return productTaxValue;
	}

	public void setProductTaxValue(BigDecimal productTaxValue) {
		this.productTaxValue = productTaxValue;
	}

	public BigDecimal getUnitPriceTTC() {
		return unitPriceTTC;
	}

	public void setUnitPriceTTC(BigDecimal unitPriceTTC) {
		this.unitPriceTTC = unitPriceTTC;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<CustomerOrderRows> getCustomerOrderRows() {
		return customerOrderRows;
	}

	public void setCustomerOrderRows(List<CustomerOrderRows> customerOderRows) {
		this.customerOrderRows = customerOderRows;
	}

	public List<SupplierOrderRows> getSupplierOrderRows() {
		return supplierOrderRows;
	}

	public void setSupplierOrderRows(List<SupplierOrderRows> supplierOderRows) {
		this.supplierOrderRows = supplierOderRows;
	}

	public List<SaleRows> getSaleRows() {
		return saleRows;
	}

	public void setSaleRows(List<SaleRows> saleRows) {
		this.saleRows = saleRows;
	}

	public List<MvtStk> getMvtStks() {
		return mvtStks;
	}

	public void setMvtStks(List<MvtStk> mvtStks) {
		this.mvtStks = mvtStks;
	}

}
