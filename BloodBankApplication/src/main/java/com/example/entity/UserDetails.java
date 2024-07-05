package com.example.entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserDetails {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	private String firstname;
	
	private String lastname;
	
	private String emailid;
	
	private String password;
	
	
	
	private String mobilenumber;
	
	private String gender;
	
	private String city;
	
	private String state;
	
	private String area;

	
	private String pincode;
	

}
