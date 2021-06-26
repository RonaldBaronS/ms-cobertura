package com.productorder.business;

import com.productorder.dao.ProductoOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductOrderImpl implements ProductOrderService {

	@Autowired
	private ProductoOrderDao dao;
	
	
	@Override
	public void registrar() {
		
		dao.registrar();
		
	}
}
