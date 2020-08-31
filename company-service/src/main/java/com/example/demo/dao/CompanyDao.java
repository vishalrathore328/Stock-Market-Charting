package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.CompanyDto;
import com.example.demo.entity.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{
	
	public Optional<Company> findByCompanyId(String id);
	public Optional<Company> findByCompanyName(String name);
}
