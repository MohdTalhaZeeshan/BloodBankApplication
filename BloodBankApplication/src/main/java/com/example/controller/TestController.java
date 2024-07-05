package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDao;
import com.example.entity.UserDetails;

@Controller
public class TestController {
	
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/show")
	public String view()
	{
		return "Login";
	}
	
	
	@RequestMapping("/registration")
	public String userRegistration(UserDetails userDetails)
	{
		          UserDetails userRegistration = userDao.userRegistration(userDetails);
		          return "Login";
	}
	
	@RequestMapping("/showregistration")
	public String showRegistration() 
	{
		return "UserRegistration";
	}
	
	
	@RequestMapping("/login")
	public String login( String emailid, String password)
	{
		UserDetails userLogin = userDao.userLogin(emailid, password);
		
		if(userLogin!=null)
		{
			return "operations";
		}
		
		else
		{
			return "Invalid Details";
		}
	}
	
	
	
	
	@RequestMapping("/page2")
	public String displayDonorsPage()
	{
		return "Donors";
	}
	
	
	@RequestMapping("/page3")
	public String registerDonor()
	{
		return "RegisterDonor";
	}
	
	

}
