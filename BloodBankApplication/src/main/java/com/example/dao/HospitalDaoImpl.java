package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.HospitalDetails;
import com.example.repository.HospitalRepository;


@Service
public class HospitalDaoImpl implements HospitalDao
{
  
	@Autowired
	 HospitalRepository hospitalRepository;
	
	@Override
	public HospitalDetails donorRegistration(HospitalDetails hospitalDetails) {
		 
		HospitalDetails hospitalDetails2 = hospitalRepository.save(hospitalDetails);
		 
		return hospitalDetails2;
	}

	@Override
	public List<HospitalDetails> getAllHospitals() {
		                    
		List<HospitalDetails> all = hospitalRepository.findAll();
		  return all;
	}

}
