package com.test.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.model.Tableprofile;
import com.test.app.service.Tableprofileservice;

import ch.qos.logback.classic.Logger;

@Controller
@RestController
public class Tableprofilecontroller {

	Logger lg;
	@Autowired
	Tableprofileservice tableprofileservice;
	
	@GetMapping("/getAllDetails")
	public List<Tableprofile> getAllDetails(){
		return tableprofileservice.getAllDetailsService();
	}
	
	@PostMapping("/createTableAccess")
	public ResponseEntity<Tableprofile> createNewEntry(@RequestBody Tableprofile tp){
		Tableprofile r2=tableprofileservice.createNewEntryservice(tp);
		return new ResponseEntity<>(r2,HttpStatus.CREATED);
		}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/addEntryNodup", method = RequestMethod.POST)
	 public ResponseEntity<String> addUserRole(@RequestBody Tableprofile tp) {
        try {
            tableprofileservice.addUserRole(tp);
            return new ResponseEntity<>("UserRole added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
	
	
//	 @RequestMapping(value = "/registerNewUser",method = RequestMethod.POST)
//	    public User registerUser(@RequestBody User user) throws Exception {
//	        return userService.registerNewUser(user);
//	    }
}
