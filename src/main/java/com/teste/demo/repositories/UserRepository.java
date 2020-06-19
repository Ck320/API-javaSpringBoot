package com.teste.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
}
