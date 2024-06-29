package com.test.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tableprofile {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int tableNo;
	String tableName;
	String userId;
	String role;
}
