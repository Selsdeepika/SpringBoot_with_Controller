package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.html.simpleparser.ALink;
import com.springboot.controllers.*;
import com.springboot.dao.Alienrepo;
import com.springboot.domain.User;
import com.springboot.model.Alien;

import io.swagger.models.Response;

@Controller
public class AlienController {
			
	//sample alien Controller

	@Autowired
	Alienrepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlien1")
	public String home1() {
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)

	{
		repo.save(alien);
		return "home.jsp";

	}
	

	@PostMapping("/addAlienpost")
	@ResponseBody

	public String addAlienpost(@RequestBody Alien alien)

	{
		repo.save(alien);
		return "home.jsp";
		

	}

	@RequestMapping(value = "/getAlien", method = RequestMethod.GET, params = { "aid" })
	@ResponseBody

	public List<Alien> getAlien(@RequestParam int aid)

	{
		try {
			List<Alien> listOfUser = null;
			System.out.println("TEST DATA");
			System.out.println("Printing AID" + aid);
			listOfUser = repo.findByAid(aid);
			System.out.println("GRATER THAN");
			System.out.println(repo.findByAidGreaterThan(1));
			System.out.println(repo.findByTech("JAVA"));// No sure why this is not working -11-Sep
			System.out.println("LESS THAN");
			System.out.println(repo.findByAidLessThan(2));
			System.out.println("SORTED");
			// System.out.println(repo.findByTechSorted("JAVA")); 11-Sep

			// Alien alien =(Alien) repo.findByAid(aid);
			// System.out.println(alien+"PRINTNED ALIEN");
			return listOfUser;

		} catch (Exception e) {
			System.out.println(e.toString());
			return null;

		}

	}
	 @RequestMapping("/aliens")
	 @ResponseBody
	 public String getaliens()
	 {
		return  repo.findAll().toString();
		 
	 }
	 @RequestMapping("/aliensList")
	 @ResponseBody
	 public List<Alien> getaliensList()
	 {
		return  (List<Alien>) repo.findAll();
		 
	 }

	/*
	 * @RequestMapping(path="/aliensListXML",produces="application/xml")
	 * 
	 * @ResponseBody public List<Alien> getaliensListXML() { return (List<Alien>)
	 * repo.findAll();
	 * 
	 * }
	 */
	 @RequestMapping("/aliensListXML")
	 @ResponseBody
	 public List<Alien> getaliensListXML()
	 {
		return  (List<Alien>) repo.findAll();
		 
	 }
	 @RequestMapping("/aliens/1")
	 @ResponseBody
	 public String getAliens()
	 {
		return  repo.findOne(1).toString();
		 
	 }
	 @RequestMapping("/alien/{aid}")
	 @ResponseBody
	 public String getAliens1(@PathVariable("aid") int aid )
	 {
		return  repo.findOne(aid).toString();
		 
	 }

	 @DeleteMapping("/alien/{aid}")
	 @ResponseBody
	 public String getAliensdelete(@PathVariable("aid") int aid )
	 {
		 Alien a=new Alien();
		 a=repo.findOne(aid);
		 repo.delete(a);
		 return "Deleted Sucess"+aid ;
		 
	 }
	 @PutMapping("/alien/{aid}")
	 @ResponseBody
	 public String getAliensupdate(@RequestBody Alien alien)
	 {
		
		 repo.save(alien);
		 return "Updated Sucess"+ alien.getAid()+alien.getAname();		 
	 }
	 
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, params = { "aid" })
    @ResponseBody
	
	public String delete(int aid)
	{
		try
		{
		Alien alien = new Alien(aid);
	    repo.delete(alien);
		return "home.jsp";
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return null;
		}
	
	}
	  @RequestMapping(value = "/updateAlien", method = RequestMethod.PUT, params = {"aid","aname"})
	  @ResponseBody
	public String updateAlien(Alien alien)
	{
		
		repo.save(alien);
		return "home.jsp";
	}
	
	
	  @RequestMapping("/addAlien")
		public String add2Alien(Alien alien)

		{
			repo.save(alien);
			return "home.jsp";

		}
}