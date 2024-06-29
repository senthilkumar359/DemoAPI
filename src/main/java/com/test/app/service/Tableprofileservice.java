package com.test.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.model.Tableprofile;
import com.test.app.repository.Tableprofilerepo;

@Service
public class Tableprofileservice {

	Tableprofilerepo tableprofilerepo;
	@Autowired
	 public Tableprofileservice(Tableprofilerepo repo) {
		 this.tableprofilerepo=repo;
	 }
	
	public List<Tableprofile> getAllDetailsService(){
		return tableprofilerepo.findAll();
	}
	
	public Tableprofile createNewEntryservice(Tableprofile tp) {
		
		return tableprofilerepo.save(tp);
	}
	
	public Tableprofile addUserRole(Tableprofile tp) throws Exception {
        if (tableprofilerepo.existsByUserIdAndRoleAndTableName(tp.getUserId(),tp.getRole(),tp.getTableName())) {
            throw new Exception("Duplicate entry: User entry already exists");
        }
        return tableprofilerepo.save(tp);
    }
}
