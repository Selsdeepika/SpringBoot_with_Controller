package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alien 
{
	@Id

	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aname;
	public String tech;
	
	public Alien()
	{
		
	}
	
	/**
	 * @param aid2
	 */
	public Alien(int aid) {
		// TODO Auto-generated constructor stub
		this.aid=aid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + "]";
	}
	
	

}
