package com.boot.OrderService.service;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.OrderService.entity.Order;
import com.boot.OrderService.repositry.OrderRepository;

@Service
public class OrderSer {
	
	@Autowired
	private OrderRepository repository;
	
	public Order placeOrder(Order order) {
		order.setOstatus(OrderProcessing());
	    order.setTransactionid(UUID.randomUUID().toString());
		return repository.save(order);
	}

	
	 public String OrderProcessing() {
     	return new Random().nextBoolean()?"success":"false";
     	
     }
	 public Order findOrderHistoryByOrderId(int oid) {
		 return repository.findById(oid);
	 }
}
