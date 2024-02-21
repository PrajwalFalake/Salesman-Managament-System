package com.expleo.salesmanServer.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expleo.salesmanServer.entity.customers;

 

@Repository
public interface CustomerRepo extends CrudRepository<customers,Integer>{

}
