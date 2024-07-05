package com.example.dao;

import com.example.entity.HospitalDetails;
import com.example.entity.UserDetails;

public interface UserDao {
	
	      UserDetails userRegistration(UserDetails userDetails);
	      UserDetails  userLogin(String emailid,String password);
	     

}
