package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.IpoDetailsDto;
import com.example.demo.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	private CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@PostMapping("/companies")
	public ResponseEntity<CompanyDto> createCompany(@RequestBody CompanyDto companyDto){
		
		return new ResponseEntity<CompanyDto> (companyService.createCompany(companyDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/companies")
	public ResponseEntity<List<CompanyDto>> getAllCompanies(){
		
		return new ResponseEntity<> (companyService.getCompanyDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/companies/{companyId}")
	public ResponseEntity<CompanyDto> getCompanyByCompanyId(@PathVariable("companyId") String id){
		
		return new ResponseEntity<CompanyDto> (companyService.findCompanyById(id), HttpStatus.FOUND);
	}
	
	@GetMapping("/companies/ipoDetails/{companyName}")
	public ResponseEntity<List<IpoDetailsDto>> getAllIpoByCompanyName(@PathVariable("companyName") String name){
		
		return new ResponseEntity<> (companyService.findByCompanyName(name), HttpStatus.FOUND);
	}
	
	@PutMapping("/companies/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto companyDto, @PathVariable("companyId") String id){
		
		return new ResponseEntity<CompanyDto> (companyService.updateCompany(id, companyDto), HttpStatus.OK);
	}
}
