package com.stock.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.management.entities.Category;
import com.stock.management.entities.CustomerOrder;
@Repository

public interface ICustomerOrderRepository<E> extends IGenericRepository<CustomerOrder>  {

	
}
