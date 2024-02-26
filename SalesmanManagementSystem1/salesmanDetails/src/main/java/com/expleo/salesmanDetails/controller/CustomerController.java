package com.expleo.salesmanDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expleo.salesmanDetails.entity.customers;
 

@Controller
public class CustomerController {
	
	@Autowired
	RestTemplate restTemplate;
	private String BASE_URL = "http://localhost:8081";
	 
	@GetMapping(path="addCus")
	public String addCus() {
		return "AddCustomer";
		
	}
	@PostMapping(path="SaveCus")
	public String SaveCus(customers c1,Model model) {
//		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/SaveCusData")
//		        .queryParam("c1",c1);
//		String url = builder.toUriString();
		System.out.println("=== "+c1);
		String url = BASE_URL+"/SaveCusData";
		ResponseEntity<ResponseModel> response = restTemplate.postForEntity(url,c1,ResponseModel.class);
		ResponseModel result = response.getBody();
		String msg=result.message;
		model.addAttribute("msg", msg);
		return "AddCustomer";
		
	}
}
