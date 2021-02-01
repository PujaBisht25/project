package com.boot.OrderService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_tb")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
private int amount;
   
public Order() {
	super();
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
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
