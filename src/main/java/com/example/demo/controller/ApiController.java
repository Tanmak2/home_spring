package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Venture;
import com.example.demo.repository.VentureRepo;

@RestController
public class ApiController {
	
	@Autowired
	VentureRepo repo;
	
	@GetMapping("/api/v1/venture")
	public List<Venture> callVenture() {
		return repo.findAll();
	}
	
	@GetMapping("/api/v1/venture/paging")
	public List<Venture> callPageVenture(Pageable pageable){
		return repo.findAll(pageable).getContent();
	}
	
}