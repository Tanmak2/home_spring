package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.VO.venture;

@Mapper
public interface EmpMapper {

	/**
	 * @Since : 2022. 11. 30.
	 * @Author : jongchan
	 * @Return : List<venture>
	 * @Comment : venture 테이블 전체 조회
	 */
	public List<venture> select_venture();
	
}
