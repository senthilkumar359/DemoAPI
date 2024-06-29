package com.test.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.model.Tablemodel;
import com.test.app.repository.Tablerepo;


@Service
public class Tableservice {
	public Tablerepo repo;
	List<Tablemodel> testmakerlist=new ArrayList<Tablemodel>();  
	List<String> tablename = new ArrayList<String>();
	@Autowired
	public Tableservice(Tablerepo repos) {
		this.repo=repos;
	}
	
	public List<Tablemodel> getall(){
		return repo.findAll();
	}
	
	public List<Tablemodel> getallmakerlist(){
		testmakerlist=repo.findAll();
		System.out.println(testmakerlist);
		return repo.findAll();
	}
	
	public List<String> getallmakertest( String str){
//		str="maker";
//		List<String> tablenamelist=new ArrayList<String>();
//		System.out.println(repo.findBytableName("map"));
//		return repo.findByrole("maker");
	return repo.findBytableName();
	}
	
	public List<String> getTableNameList(){
		
		return repo.findBytableName();
	}
	
}
