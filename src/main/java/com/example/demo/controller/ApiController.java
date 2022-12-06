package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VO.venture;
import com.example.demo.mapper.EmpMapper;

@RestController
public class ApiController {
	
	@Autowired
	EmpMapper empMapper;

	@GetMapping("/api/v1/venture")
	public List<venture> callVenture(){
		return empMapper.select_venture();
	}
	
}