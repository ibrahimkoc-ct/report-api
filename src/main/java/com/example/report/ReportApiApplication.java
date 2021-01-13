package com.example.report;


import java.io.IOException;
import java.io.Reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

@SpringBootApplication

@EnableAutoConfiguration
@ComponentScan(basePackages="com.ba")
public class ReportApiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ReportApiApplication.class, args);
		
		System.out.println("Run!");
	}

}
