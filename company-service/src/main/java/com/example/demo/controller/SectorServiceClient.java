package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.SectorDto;

@FeignClient("sector-ms")
public interface SectorServiceClient {

	@GetMapping("/{sectorId}")
	public ResponseEntity<SectorDto> getSectorById(@PathVariable("sectorId") Long sectorId);
	
	@PostMapping("/")
	public ResponseEntity<SectorDto> addSector(@RequestBody SectorDto sectorDto);

}
