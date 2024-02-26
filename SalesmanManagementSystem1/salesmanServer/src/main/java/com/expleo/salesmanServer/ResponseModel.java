package com.expleo.salesmanServer;

import java.util.List;

import com.expleo.salesmanServer.entity.Salesman;
import com.expleo.salesmanServer.entity.customers;

public class ResponseModel {

	public boolean status;
	public String message;
	private Salesman salesman;
	public Salesman getSalesman() {
		return salesman;
	}
	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}
	private List<customers> customersList;
	public List<customers> getCustomersList() {
		return customersList;
	}
	public void setCustomersList(List<customers> customersList) {
		this.customersList = customersList;
	}
	
	
	 
	
	
	
	
	
	
}
