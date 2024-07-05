package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.DonorDetails;
import com.example.repository.DonorRepository;

@Service
public class DonorDaoImpl implements DonorDao
{
	
	  @Autowired
	 DonorRepository donorRepository;

	@Override
	public List<DonorDetails> findByBloodgroupAndCityAndArea(String city, String bloodgroup, String area) {
		List<DonorDetails> byCityAndBloodgroup = donorRepository.findByCityAndBloodgroupAndArea(city, bloodgroup,area);
	       return byCityAndBloodgroup;
		
	}

	@Override
	public DonorDetails donorRegistration(DonorDetails donorDetails) {
		
	 DonorDetails details = donorRepository.save(donorDetails);
		return details;
	}

	
	
	

}
