package com.expleo.salesmanServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.customers;
import com.expleo.salesmanServer.repo.CustomerRepo;
 

@Service
public class CustomerService {
	@Autowired
	CustomerRepo repo;
	
	public ResponseModel AddCustomer(customers c1) {
		repo.save(c1);
		ResponseModel responseModel = new ResponseModel();
		responseModel.status=true;
		responseModel.message="Customer Data Added Successfully...!";
		return responseModel;
	}
	public List<customers> findByRegion(String region){
		return repo.findByRegion(region);
		
	}
}
