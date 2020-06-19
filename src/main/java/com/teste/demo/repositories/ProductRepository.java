package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
	
}
