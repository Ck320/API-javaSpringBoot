package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>
{
	
}
