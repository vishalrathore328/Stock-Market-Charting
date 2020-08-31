package com.examole.demo.service;

import java.util.List;

import com.examole.demo.dto.CompanyDto;
import com.examole.demo.dto.SectorDto;


public interface SectorService {

	public SectorDto getSectorById(Long sectorId);

	public List<CompanyDto> getCompaniesBySectorId(Long sectorId);

	public void addSector(SectorDto sectorDto);

}
