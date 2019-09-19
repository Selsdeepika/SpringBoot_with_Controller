package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Acs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String empname;
	public String empphone;
	
}
