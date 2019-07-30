package com.scb.guass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.scb.guass.model.Acc;
import com.scb.guass.model.Accounts;
import com.scb.guass.model.Groups;
import com.scb.guass.model.Student;
import com.scb.guass.repository.GroupRepository;


@RequestMapping("group")

@RestController
public class Controller {
	
	@Autowired
	GroupRepository custRes;
	
	
	/* adding a resource*/
	
	@PostMapping("/add")
	private int add(@RequestBody Groups grp) {
		return custRes.add(grp);
	}

	/* updating a resource*/
	
	@PutMapping("/update")
	private int update(@RequestBody Accounts acc) {
		return custRes.update(acc);
	}
	
	
	  @PutMapping("/updategroup") 
	  private int update(@RequestBody Groups grp) 
	  { 
		  return custRes.update(grp); 
		  }
	  
		
	 
	@RequestMapping("/findall/{id}")
	public List<Accounts> findAll(@PathVariable Long id)
	{
		return custRes.findAllOrderWithItems(id);
		
	}
	
	@RequestMapping("/findallgroup/{id}")
	public List<Groups> findAll1(@PathVariable Long id)
	{
		return custRes.findAllOrderWithItems1(id);
		
	}
	
	@RequestMapping("/find/{id}")
	public List<Accounts> find(@PathVariable Long id)
	{
		return custRes.findOrderWithItem(id);
		
	}
	@RequestMapping("/findcustomer/{id}")
	public List<Student> find2(@PathVariable Long id)
	{
		return custRes.findOrderWithItems2(id);
		
	}
	@RequestMapping("/findgroup/{id}")
	public List<Groups> find1(@PathVariable Long id)
	{
		return custRes.findOrderWithItem1(id);
		
	}

}
