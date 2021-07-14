package com.stock.management.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.management.entities.Product;
import com.stock.management.repositories.IProductRepository;
import com.stock.management.repositories.impl.IGenericRepositoryImpl;
import com.stock.management.services.IProductService;

@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository iProductRepository;
	
	//@Autowired
	IGenericRepositoryImpl iGenericRepositoryImpl;
	
	
	
	public IProductServiceImpl() {
		super();
		iGenericRepositoryImpl=new IGenericRepositoryImpl();
	}

	@Override
	public Product save(Product entity) {
		return iProductRepository.save(entity);
	}

	@Override
	public Product update(Product entity) {
		return iProductRepository.save(entity);
	}

	@Override
	public List<Product> selectAll() {
		return iProductRepository.findAll();
	}

	@Override
	public List<Product> selectAll(String sortField, String sort) {
		return iProductRepository.selectAll("produit",sortField, sort);
	}

	@Override
	public Product getByID(Long id) {
		return iProductRepository.getById(id);
	}

	@Override
	public void remove(Long id) {
		iProductRepository.deleteById(id);
		
	}

	@Override
	public Product findOne(String paramName, String paramValue) {
		return iProductRepository.findOne("produit",paramName, paramValue);
	}

	@Override
	public Product findOne(String[] paramNames, String[] paramValues) {
		return iGenericRepositoryImpl.findOneByFields("produit",paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return iProductRepository.findCountBy("produit",paramName, paramValue);
	}


}
