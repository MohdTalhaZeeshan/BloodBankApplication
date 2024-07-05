package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DonorDetails;
import java.util.List;


public interface DonorRepository extends JpaRepository<DonorDetails, Integer>
{
	     List<DonorDetails> findByCityAndBloodgroupAndArea(String city, String bloodgroup,String area);

}
