package com.productorder.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.productorder.business.ProductOrderService;
import com.productorder.model.MessageResponse;
import com.productorder.model.RequestContent;
import com.productorder.util.ProductOrderConstantes;

@RestController
@RequestMapping("/productorder")
public class ProductoOrderController {
	
	@Autowired
	private ProductOrderService service;
	
	
	@PostMapping("/cobertura")
	public ResponseEntity<MessageResponse> registrar(@RequestBody RequestContent content) {
		service.registrar();
		return new ResponseEntity<>(
				new MessageResponse(ProductOrderConstantes.MENSAJE_EXITOSO),HttpStatus.CREATED);
	}
	
}
