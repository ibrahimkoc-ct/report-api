package com.ba.service;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ba.dao.Dao;
import com.ba.dto.Dto;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

@Service
public class DtoService {

	public List<Dto> getTopFiveProduct() throws IOException {
		
		return Dao.getTopFiveProduct();
	}
	
	public List<Dto> totalAmountByPaymentType() throws IOException {
		
		return Dao.totalAmountByPaymentType();
	}
	
	public List<Dto> waiterSalesAmount() throws IOException {
		
		return Dao.waiterSalesAmount();
	}
	
	public List<Dto> getTopFiveCategory() throws IOException {
		
		return Dao.getTopFiveCategory();
	}
	
	public List<Dto> getTopSalesCustomer() throws IOException {
		
		return Dao.getTopSalesCustomer();
	}
	
	public List<Dto> salesLastWeek() throws IOException {
		
		return Dao.salesLastWeek();
	}
	
	public List<Dto> tableOrNotTable() throws IOException {
		
		return Dao.tableOrNotTable();
	}
	

}
