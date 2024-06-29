package com.test.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.model.Tablemodel;
import com.test.app.service.Tableservice;

import jakarta.persistence.Table;

@Controller
@RestController
public class Tablecontroller {

	@Autowired
	public Tableservice tableservice;
	
	//working
	@GetMapping("/getall")
	public List<Tablemodel> getAllValues(){
		return this.tableservice .getall();
	}
	
	@CrossOrigin
	@GetMapping("/getAllTableName")
	public List<String> getTableName(){
		return this.tableservice.getTableNameList();
				
	}
	//ignore
	@GetMapping("/getallmaker")
	public List<Tablemodel> getallmaker(){
		return this.tableservice.getallmakerlist();
	}
	
	@GetMapping("/getmaker")
	public List<String> getmaker( String role)
	{
		return this.tableservice.getallmakertest(role);
	}
}
