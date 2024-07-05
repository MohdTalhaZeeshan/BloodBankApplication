package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.DonorDao;
import com.example.entity.DonorDetails;

@Controller
public class DonorController {
	
	@Autowired
	DonorDao donorDao;
	
	 @RequestMapping("/registerdonor")
	public String registerDonor(DonorDetails donorDetails)
	{
		
		
		 DonorDetails donorRegistration = donorDao.donorRegistration(donorDetails);
		 return "operations";
	}
	
	@RequestMapping("/search")
	public String findDonors(String city,String bloodgroup,String area,Model model)
	{
 
		List<DonorDetails> byBloodgroupAndCityAndArea = donorDao.findByBloodgroupAndCityAndArea(city, bloodgroup, area);
		model.addAttribute("list",byBloodgroupAndCityAndArea);
		System.out.println(byBloodgroupAndCityAndArea.size());
		return "DisplayDonors";
		  
	}
	
	

}
