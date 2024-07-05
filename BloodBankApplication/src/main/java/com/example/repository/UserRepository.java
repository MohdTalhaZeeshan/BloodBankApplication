package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.UserDetails;
import java.util.List;


public interface UserRepository extends JpaRepository<UserDetails, Integer>
{
	 UserDetails  findByEmailidAndPassword(String emailid,String password);

}
