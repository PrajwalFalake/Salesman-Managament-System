package com.expleo.salesmanServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.customers;
import com.expleo.salesmanServer.service.CustomerService;

 

@RestController
public class RestCustomerController {
	@Autowired
	CustomerService service;

	@GetMapping(path="/SaveCusData")
	public ResponseEntity<ResponseModel> SaveCus(customers c1) {
		ResponseModel responseModel= service.AddCustomer(c1);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
		 
		
	}
}
