package com.boot.ProductService.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.boot.ProductService.common.TransactionRequest;
import com.boot.ProductService.common.TransactionResponse;

import com.boot.ProductService.service.ProductSer;



@RestController

public class ProductController {
	
	@Autowired
	private ProductSer service;
	
	@PostMapping("/bookproduct")
	
	public TransactionResponse bookproduct(@RequestBody TransactionRequest request) {
        return service.saveProduct(request);
    }
	
	
	
	

}
