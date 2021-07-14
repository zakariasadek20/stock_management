package com.stock.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.stock.management.entities.Product;

@NoRepositoryBean
public interface IGenericRepository<E> extends JpaRepository<E, Long>  {

	/*public E save(E entity);
	
	public E update(E entity);
	
	public List<E> selectAll();
	
	public List<E> selectAll(String sortField,String sort);
	
	public E getByID(Long id);
	
	public void remove(Long id);
	
	public E findOne(String paramName,Object paramValue);
	
	public E findOne(String[] paramNames,Object[] paramValues)
	
	public int findCountBy(String paramName,String paramValue);*/
	
	@Query(value="SELECT * FROM :tableName ORDER BY :sortfield :sort",nativeQuery = true)
	public List<Product> selectAll(String tableName,String sortfield,String sort);
	
	@Query (value = "SELECT * FROM :tableName WHERE :paramName = :paramValue",nativeQuery = true)
	public Product findOne(String tableName,String paramName,String paramValue);
	
	
	//public Product findOneByFields(String tableName,String[] paramNames,String[] paramValues);
	
	@Query(value = "SELECT * FROM :tableName WHERE :query",nativeQuery = true)
	public Product findOneByQuery(String tableName,String query);
	
	@Query(value = "SELECT COUNT(*) FROM :tableName WHERE :paramName = :paramValue",nativeQuery = true)
	public int findCountBy(String tableName,String paramName,String paramValue);
	
}
