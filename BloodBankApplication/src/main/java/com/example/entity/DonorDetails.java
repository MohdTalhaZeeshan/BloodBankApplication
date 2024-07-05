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
public class DonorDetails {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer donorid;
	 @Column(nullable = false)
	 private String name;
	 
	 @Column(nullable = false)
	 private int age;
	 
	 @Column(nullable = false)
	 private String gender;
	 
	 @Column(nullable = false)
	 private String bloodgroup;
	 
	 @Column(nullable = false,length = 10)
	 private String mobilenumber;
	 
	 
	 @Column(nullable = false)
	 private String area;
	 
	 
	 @Column(nullable = false)
	 private String city;
	 
	 @Column(nullable = false)
	 private String state;
	 
	 
	
}
