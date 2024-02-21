package com.expleo.salesmanServer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.salesmanServer.ResponseModel;
import com.expleo.salesmanServer.entity.Salesman;
import com.expleo.salesmanServer.repo.SalemanRepo;
 

@Service
public class SalesmanService {
	@Autowired
	SalemanRepo repo;
	
	public ResponseModel AddSalesman(Salesman s1) {
		 repo.save(s1);
		 ResponseModel responseModel = new ResponseModel();
		 responseModel.status = true;
		 responseModel.message = "Salesman Data Added successfully";
		 return responseModel;
	}
	
	public ResponseModel findBySalesmanId(int SId , String password) {
		Optional<Salesman> opt=repo.findById(SId);
		Salesman s1= opt.get();
		ResponseModel responseModel = new ResponseModel();
		
		if(s1==null) {
			//register
			responseModel.status = false;
			responseModel.message = "Account not found..  ";
		} else {
			if(s1.getPswd().equals(password)) {
				//match
				responseModel.status = true;
				responseModel.message = "Logged in";
			} else {
			    //invalid pass
				responseModel.status = false;
				responseModel.message = "Invalid password";
			}
		}
		return responseModel;
	}
	
}
