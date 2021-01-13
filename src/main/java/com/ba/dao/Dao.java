package com.ba.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ba.dto.Dto;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class Dao {
	public static SqlMapClient sqlMapClient() throws IOException {
		Reader reader = Resources.getResourceAsReader("batis-config.xml");
		SqlMapClient client = SqlMapClientBuilder.buildSqlMapClient(reader);
		return client;

	}

	public static List<Dto> getTopFiveProduct() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.getTopFiveProduct");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> totalAmountByPaymentType() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.totalAmountByPaymentType");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> waiterSalesAmount() throws IOException {
		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.waiterSalesAmount");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> getTopFiveCategory() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.getTopFiveCategory");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> getTopSalesCustomer() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.getTopSalesCustomer");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> salesLastWeek() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.salesLastWeek");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

	public static List<Dto> tableOrNotTable() throws IOException {

		try {
			return (List<Dto>) sqlMapClient().queryForList("dto.tableOrNotTable");
		} catch (SQLException e) {
			System.out.println("DB işlemleri gerçekleşemedi! e:" + e);
		}

		return null;
	}

}
