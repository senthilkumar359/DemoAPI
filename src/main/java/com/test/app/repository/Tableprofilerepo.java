package com.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.app.model.Tableprofile;

@Repository
public interface Tableprofilerepo extends JpaRepository<Tableprofile,String >{

	 boolean existsByUserIdAndRoleAndTableName(String userId, String role, String tableName);

}
