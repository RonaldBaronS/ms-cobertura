package com.productorder.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
public class ProdutOrderProperties {
		
	@Value("${application.data.}")
	private String nameDb;
	
	@Value("${application.data.}")
	private String port;
	
	@Value("${application.data.}")
	private String user;
	
	@Value("${application.data.}")
	private String password;

}
