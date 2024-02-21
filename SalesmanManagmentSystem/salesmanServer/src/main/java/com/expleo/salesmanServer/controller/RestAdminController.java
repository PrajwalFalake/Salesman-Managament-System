package com.expleo.salesmanServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.Salesman;
import com.expleo.salesmanServer.service.SalesmanService;

 

@RestController
public class RestAdminController {
	@Autowired
	SalesmanService service;
	
	@GetMapping(path="/addsalesmanData")
	public ResponseEntity<ResponseModel> salesmanData(Salesman s1) {
		ResponseModel responseModel= service.AddSalesman(s1);
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
		
	}
	
	
}
