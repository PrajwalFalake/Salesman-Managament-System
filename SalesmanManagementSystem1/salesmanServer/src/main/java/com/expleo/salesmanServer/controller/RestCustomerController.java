package com.expleo.salesmanServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.customers;
import com.expleo.salesmanServer.service.CustomerService;

 

@RestController
public class RestCustomerController {
	@Autowired
	CustomerService service;

	@PostMapping(path="/SaveCusData")
	public ResponseEntity<ResponseModel> SaveCus(@RequestBody customers c1) {
		System.out.println("===sasassa "+c1);
		ResponseModel responseModel= service.AddCustomer(c1);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	@GetMapping("/byname/{name}")
    public List<customers> getUsersByName(String region) {
        return service.findByRegion(region);
    }
}
