package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Product;

public interface IProductService {

	public Product save(Product entity);
	
	public Product update(Product entity);
	
	public List<Product> selectAll();
	
	public List<Product> selectAll(String sortField,String sort);
	
	public Product getByID(Long id);
	
	public void remove(Long id);
	
	public Product findOne(String paramName,String paramValue);
	
	public Product findOne(String[] paramNames,String[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
}
