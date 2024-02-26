//package com.expleo.salesmanDetails.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import com.expleo.salesmanDetails.entity.taskTable;
//
//@Controller
//public class TaskController {
//	@Autowired
//	RestTemplate restTemplate;
//	private String BASE_URL = "http://localhost:8081";
//	
//	@PostMapping(path="/addTask")
//	public String addTask() {
//		return "taskform";
//		
//	}
//	@PostMapping(path="/saveTask")
//	public String saveTask(taskTable t1,Model model) {
//		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/SaveCusData")
//		        .queryParam("t1",t1);
//		String url = builder.toUriString();
//		
//		
//		return null;
//		
//	}
//	
//}
