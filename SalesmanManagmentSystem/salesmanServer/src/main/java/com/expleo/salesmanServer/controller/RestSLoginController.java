package com.expleo.salesmanServer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.Salesman;
import com.expleo.salesmanServer.service.SalesmanService;

 
 
@RestController
public class RestSLoginController {
	@Autowired
	SalesmanService service;
	
	@GetMapping(path="/salesmanlogin")
	public ResponseEntity<ResponseModel> slogin(@RequestParam int SId,@RequestParam String pswd,Model model) {
		
		ResponseModel responseModel = service.findBySalesmanId(SId, pswd);
		
		final HttpHeaders httpHeaders = new  HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		ResponseEntity<ResponseModel> re = new ResponseEntity<ResponseModel>(responseModel, httpHeaders, HttpStatus.OK);
		return re;	
	}
}
