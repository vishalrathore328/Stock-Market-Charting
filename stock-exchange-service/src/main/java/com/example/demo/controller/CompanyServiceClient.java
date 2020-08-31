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

@FeignClient("company-ms")
public interface CompanyServiceClient {

	@GetMapping("/allcompanies")
	public ResponseEntity<List<CompanyDto>> getAllCompanies();
	
	@GetMapping("/{companyId}")
	public ResponseEntity<CompanyDto> getCompanyById(@PathVariable("companyId") Long companyId);
	
	@PostMapping("/")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto company);
	
	@PutMapping("/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto company, @PathVariable("companyId") Long companyId);
	
	@DeleteMapping("/{companyId}")
	public ResponseEntity<CompanyDto> deleteCompany(@PathVariable("companyId") Long companyId);


}
