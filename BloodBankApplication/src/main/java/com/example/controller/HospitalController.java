package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.HospitalDao;
import com.example.entity.HospitalDetails;

@Controller
public class HospitalController {
	
	
	@Autowired
	HospitalDao hospitalDao;
	
	
	@RequestMapping("/donate")
	public String donorRegistration(HospitalDetails hospitalDetails)
	{
		HospitalDetails donorRegistration = hospitalDao.donorRegistration(hospitalDetails);
		
		return "operations";
		
		
	}
	
	
	@RequestMapping("/page1")
	public String getHospitals(Model model)
	{
		 List<HospitalDetails> allHospitals = hospitalDao.getAllHospitals();
		 model.addAttribute("hosp",allHospitals);
		 return "Donate";
	}

}
