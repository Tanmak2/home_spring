package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VO.venture;
import com.example.demo.service.EmpService;

@RestController
public class ApiController {
	
	@Autowired
	EmpService service;

	@GetMapping("/api/v1/venture")
	public List<venture> callVenture(){
		return service.select_venture();
	}
	
	@GetMapping("/api/v1/venture/search/{data}")
	public List<venture> searchVentureByCompany(@PathVariable String data){
		return service.selectVentureFindByColumnData(data);
	}
	
	@GetMapping("/api/v1/venture/{index}")
	public List<venture> select_venture_list(@PathVariable int index){
		return service.select_venture_list(index);
	}
	
}