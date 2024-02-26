package com.expleo.salesmanDetails.controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.expleo.salesmanDetails.entity.Salesman;
import com.expleo.salesmanDetails.entity.customers;
 
 
@Controller
public class SLoginController {
	@Autowired
	RestTemplate restTemplate;
	private  String BASE_URL = "http://localhost:8081";

	@GetMapping(path="slogin")
	public String slogin(@RequestParam int SId,@RequestParam String pswd,Model model) {
	
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/salesmanlogin")
		        .queryParam("SId", SId)
		        .queryParam("pswd", pswd);
				 
		String url = builder.toUriString();
		ResponseEntity<ResponseModel> response = restTemplate.getForEntity(url, ResponseModel.class);
		
		ResponseModel result =  response.getBody();
		Salesman s1= result.getSalesman();
		List<customers> list= result.getCustomersList();
		if(result.status) {
			//Passed -> navigate to dashboard
			model.addAttribute("list", list);
			model.addAttribute("name", s1.getName());
			model.addAttribute("region", s1.getRegion());
			return "SalesmanIndex";
			
		}
		//else {
//			String msg = result.message;
//			model.addAttribute("msg", msg);
//			return 
//			
//		}
		
		return "index";
		 
		
		
	}
}
