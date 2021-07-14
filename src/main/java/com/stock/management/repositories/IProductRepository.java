package com.stock.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stock.management.entities.Product;
@Repository
public interface IProductRepository extends IGenericRepository<Product>  {

	
	/*@Query(value="SELECT * FROM product ORDER BY :sortfield :sort",nativeQuery = true)
	public List<Product> selectAll(String sortfield,String sort);
	
	@Query (value = "SELECT * FROM product WHERE :paramName = :paramValue",nativeQuery = true)
	public Product findOne(String paramName,String paramValue);
	
	
	public Product findOneByFields(String[] paramNames,String[] paramValues);
	
	@Query(value = "SELECT * FROM product WHERE :query",nativeQuery = true)
	public Product findOneByQuery(String query);
	
	@Query(value = "SELECT COUNT(*) FROM product WHERE :paramName = :paramValue",nativeQuery = true)
	public int findCountBy(String paramName,String paramValue);*/
	
}
