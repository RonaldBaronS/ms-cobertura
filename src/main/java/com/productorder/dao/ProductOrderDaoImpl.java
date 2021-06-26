package com.productorder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.productorder.config.ProdutOrderProperties;

@Component
public class ProductOrderDaoImpl implements ProductoOrderDao {

	@Autowired
	ProdutOrderProperties properties;
	
	
	@Override
	public void registrar() {
		
	}

}
