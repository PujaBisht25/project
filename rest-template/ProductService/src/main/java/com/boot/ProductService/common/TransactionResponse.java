package com.boot.ProductService.common;

import com.boot.ProductService.entity.Product;

public class TransactionResponse {
    private Product product;
    private double amount;
    private String transactionid;
    private String message;
    
	public TransactionResponse(Product product, double amount, String transactionid, String message) {
		super();
		this.product = product;
		this.amount = amount;
		this.transactionid = transactionid;
		this.message = message;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
}
    
    
	