package com.expleo.salesmanServer.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.salesmanServer.entity.customers;

 

@Repository
public interface CustomerRepo extends ListCrudRepository<customers,Integer>{
	 List<customers> findByRegion(String region);
}
