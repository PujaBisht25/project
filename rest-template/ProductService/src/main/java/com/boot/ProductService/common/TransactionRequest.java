package com.boot.ProductService.common;

import com.boot.ProductService.entity.Product;

public class TransactionRequest {
	
	
	private Product product;
	
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}
