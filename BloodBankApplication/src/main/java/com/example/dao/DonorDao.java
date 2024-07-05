package com.example.dao;

import com.example.entity.DonorDetails;

import java.util.List;

public interface DonorDao {
	 DonorDetails     donorRegistration(DonorDetails donorDetails);           
	List<DonorDetails>  findByBloodgroupAndCityAndArea(String city,String bloodgroup,String area);

}

