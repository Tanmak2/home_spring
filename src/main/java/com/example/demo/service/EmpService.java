package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.VO.venture;
import com.example.demo.mapper.EmpMapper;

@Service
public class EmpService {
	
	@Autowired
	EmpMapper mapper;
	
	public List<venture> select_venture(){
		return mapper.select_venture();
	}
	
	public List<venture> selectVentureFindByColumnData(String data){
		return mapper.selectVentureFindByColumnData(data);
	}
	
	public List<venture> select_venture_list(int index){
		return mapper.select_venture_list(index);
	}
}
