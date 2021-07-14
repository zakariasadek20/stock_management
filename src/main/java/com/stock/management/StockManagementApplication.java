package com.stock.management;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.stock.management.entities.Product;
import com.stock.management.repositories.IProductRepository;

@SpringBootApplication
public class StockManagementApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(StockManagementApplication.class, args);
		
//		IProductRepository iProductRepository=applicationContext.getBean(IProductRepository.class);	
//		
//		iProductRepository.save(new Product("1-ZA", "PRODUIT 1", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("2-ZA", "PRODUIT 2", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("3-ZA", "PRODUIT 3", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("4-ZA", "PRODUIT 4", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("5-ZA", "PRODUIT 5", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("6-ZA", "PRODUIT 6", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
//		iProductRepository.save(new Product("7-ZA", "PRODUIT 7", new BigDecimal(125), new BigDecimal(125), new BigDecimal(125), "HHH"));
	}

}
