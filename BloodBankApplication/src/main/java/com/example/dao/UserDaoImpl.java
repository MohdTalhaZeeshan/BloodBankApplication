package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.HospitalDetails;
import com.example.entity.UserDetails;
import com.example.repository.UserRepository;

@Service
public class UserDaoImpl implements UserDao
{
          @Autowired
	UserRepository userRepository;
          
          
	 
	@Override
	public UserDetails userRegistration(UserDetails userDetails) {
		
		 UserDetails details = userRepository.save(userDetails);
		 return details;
	}

	@Override
	public UserDetails userLogin(String emailid, String password) {
		
		  UserDetails userDetails = userRepository.findByEmailidAndPassword(emailid, password);
		      
		  return userDetails;
		
	}

	
	

}
