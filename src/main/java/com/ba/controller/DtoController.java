package com.ba.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.dto.Dto;
import com.ba.service.DtoService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class DtoController {

	
	@Autowired
	DtoService service;
	
	@GetMapping("top-product")
	public List<Dto> getTopFiveProduct() throws IOException {
		return service.getTopFiveProduct();
	}
	
	@GetMapping("payment-type")
	public List<Dto> totalAmountByPaymentType() throws IOException {
		return service.totalAmountByPaymentType();
	}
	
	@GetMapping("waiter-amount")
	public List<Dto> waiterSalesAmount() throws IOException {
		return service.waiterSalesAmount();
	}
	
	@GetMapping("top-category")
	public List<Dto> getTopFiveCategory() throws IOException {
	
		 return service.getTopFiveCategory();
	}
	
	@GetMapping("sales-customer")
	public List<Dto> getTopSalesCustomer() throws IOException {
		return service.getTopSalesCustomer();
	}
	
	@GetMapping("sales-week")
	public List<Dto> salesLastWeek() throws IOException {
		return service.salesLastWeek();
	}
	@GetMapping("table-nottable")
	public List<Dto> tableOrNotTable() throws IOException {
		return service.tableOrNotTable();
	}
	
	
}
