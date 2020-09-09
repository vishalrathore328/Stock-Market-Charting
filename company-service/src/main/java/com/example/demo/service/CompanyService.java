package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.IpoDetailsDto;
import com.example.demo.entity.Company;

public interface CompanyService {
	
	public List<CompanyDto> getCompanyDetails();
	public CompanyDto findCompanyById(String id);
	public CompanyDto createCompany(CompanyDto companyDto);
	public List<IpoDetailsDto> findByCompanyName(String name);
	public CompanyDto updateCompany(String id, CompanyDto companyDto);
}
