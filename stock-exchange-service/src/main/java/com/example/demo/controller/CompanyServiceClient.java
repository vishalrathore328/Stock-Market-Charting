package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.CompanyDto;

@FeignClient("company-service")
public interface CompanyServiceClient {
	
	@GetMapping("/company/companies")
	public ResponseEntity<List<CompanyDto>> getAllCompanies();
	
	@GetMapping("/company/companies/{companyId}")
	public ResponseEntity<CompanyDto> getCompanyByCompanyId(@PathVariable("companyId") String companyId);
	
	@PostMapping("/company/companies")
	public ResponseEntity<CompanyDto> createCompany(@RequestBody CompanyDto company);
	
	@PutMapping("/company/companies/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto company, @PathVariable("companyId") String companyId);

}