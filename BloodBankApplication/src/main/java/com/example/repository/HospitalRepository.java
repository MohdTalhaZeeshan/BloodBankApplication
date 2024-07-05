package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.HospitalDetails;

public interface HospitalRepository extends JpaRepository<HospitalDetails, Integer>
{

}
