package com.boot.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.ProductService.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
