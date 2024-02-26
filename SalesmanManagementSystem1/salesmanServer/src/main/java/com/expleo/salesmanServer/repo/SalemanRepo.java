package com.expleo.salesmanServer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.salesmanServer.entity.Salesman;

 


@Repository
public interface SalemanRepo extends ListCrudRepository<Salesman,Integer> {
	
	public String findByName(String name);
}
