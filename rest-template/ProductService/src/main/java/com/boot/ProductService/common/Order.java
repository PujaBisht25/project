package com.boot.ProductService.common;




public class Order {
	
   private int oid;
 
   private String ostatus;
   private String transactionid;
   private int productid;
   private String productname;
   public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
private double amount;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}

public String getOstatus() {
	return ostatus;
}
public void setOstatus(String ostatus) {
	this.ostatus = ostatus;
}
public String getTransactionid() {
	return transactionid;
}
public void setTransactionid(String transactionid) {
	this.transactionid = transactionid;
}
   
   
   
   
}

