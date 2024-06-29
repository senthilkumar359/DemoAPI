package com.test.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.app.model.Tablemodel;

@Repository
public interface Tablerepo extends JpaRepository<Tablemodel, String>{
	
//	@Query("")

	//	public List<Tablemodel> findmaker();
//List<Tablemodel> findByrole(String role);

@Query("select tableName from Tablemodel")
public List<String> findBytableName();

//@Query("INSERT INTO `testdb`.`tableprofile` (`table_no`, `role`, `table_name`, `user_id`) VALUES ('4', 'checker', 'infra', 'na55780');\r\n"
//		+ "")
}
