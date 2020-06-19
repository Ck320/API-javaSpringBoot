package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
	
}
