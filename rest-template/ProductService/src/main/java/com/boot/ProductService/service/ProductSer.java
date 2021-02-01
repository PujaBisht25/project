package com.boot.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.boot.ProductService.common.Order;
import com.boot.ProductService.common.TransactionRequest;
import com.boot.ProductService.common.TransactionResponse;
import com.boot.ProductService.entity.Product;
import com.boot.ProductService.repository.ProductRepository;

@Service
public class ProductSer {
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	public TransactionResponse saveProduct(TransactionRequest request)
	{  	
		String response="";
		Product product =request.getProduct();
	Order order =request.getOrder();
	order.setProductid(product.getPid());
	order.setProductname(product.getPname());
	order.setAmount(product.getPprice());
	 //rest call
   Order orderResponse=	template.postForObject("http://localhost:9100/placeorder", order, Order.class);
   response=(orderResponse.getOstatus().equals("success"))?"order placed":"sorry order cancelled";
   
	   repository.save(product);
	
		return new TransactionResponse(product,orderResponse.getAmount(),orderResponse.getTransactionid(),response);
		
	}

	
	

}
