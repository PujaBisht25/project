package com.boot.OrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.OrderService.entity.Order;
import com.boot.OrderService.service.OrderSer;

@RestController

public class OrderController {
	
	@Autowired
	private OrderSer service;
	
	@PostMapping("/placeorder")
	public Order placeOrder(@RequestBody Order order) {
		return service.placeOrder(order);
		
	}
	@GetMapping("/history/{oid}")
	public Order findOrderHistoryByOrderId(@PathVariable int oid) {
		return service.findOrderHistoryByOrderId(oid);
	}
       
}
