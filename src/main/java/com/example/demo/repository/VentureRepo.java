package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Venture;

public interface VentureRepo extends JpaRepository<Venture, Long>{
	
}
