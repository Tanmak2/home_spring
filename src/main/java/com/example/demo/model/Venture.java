package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "venture")
public class Venture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "num")
	private Long id;
	@Column
	private String company;
	@Column
	private String addr;
	@Column
	private String category;
	@Column
	private String business_name;
	@Column
	private String product;
}
