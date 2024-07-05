package com.example.dao;

import java.util.List;

import com.example.entity.HospitalDetails;

public interface HospitalDao {
	
  HospitalDetails	donorRegistration(HospitalDetails hospitalDetails);
  List<HospitalDetails> getAllHospitals();
}
