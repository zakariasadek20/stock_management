package com.stock.management.repositories.impl;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;

import com.stock.management.entities.Product;
import com.stock.management.repositories.IGenericRepository;
import com.stock.management.repositories.IProductRepository;

public class IGenericRepositoryImpl {

	@Autowired
	IGenericRepository<Product> iGenericRepository;
	
	//@Override
	public Product findOneByFields(String tableName, String[] paramNames, String[] paramValues) {
		String searchQuery="";
		Product product=null;
		if (paramNames.length==paramValues.length && paramNames.length>0) {
			
			for (int i = 0; i < paramNames.length; i++) {
				
				searchQuery+=" "+paramNames[i]+" = "+paramValues[i];
				
				searchQuery+=i<paramNames.length? " and" : "";
			}
			
			System.out.println(searchQuery);
			
			product=iGenericRepository.findOneByQuery(tableName,searchQuery);
			
			
		}
		
		return product;
	}
}
