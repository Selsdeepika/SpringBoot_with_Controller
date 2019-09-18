package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.model.Alien;


public interface Alienrepo extends CrudRepository<Alien,Integer>
{

	 List<Alien> findByAid(int aid);
	 List<Alien> findByTech(String tech);//No sure why this is not working 11-Sep
	 List<Alien> findByAidGreaterThan(int aid);
	 List<Alien> findByAidLessThan(int aid);
	// 11-Sep
	 
	// @Query("from Alien where tech?1 order by aname")
	// List <Alien> findByTechSorted(String tech);
	 // 11-Sep
	

}
