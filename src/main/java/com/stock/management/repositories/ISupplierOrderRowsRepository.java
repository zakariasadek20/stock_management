package com.stock.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.management.entities.SupplierOrderRows;
@Repository
public interface ISupplierOrderRowsRepository<E> extends IGenericRepository<SupplierOrderRows>  {

	
}
