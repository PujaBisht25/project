package com.boot.OrderService.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.OrderService.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
	Order findById(int customerId);

}
