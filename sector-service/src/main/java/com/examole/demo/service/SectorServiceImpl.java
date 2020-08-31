package com.examole.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examole.demo.dto.CompanyDto;
import com.examole.demo.dto.SectorDto;
import com.examole.demo.entity.SectorEntity;
import com.examole.demo.repo.SectorRepository;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	private SectorRepository sectorRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public SectorServiceImpl(SectorRepository sectorRepository) {
		super();
		this.sectorRepository = sectorRepository;
	}

	@Override
	@Transactional
	public SectorDto getSectorById(Long sectorId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(sectorRepository.findById(sectorId), SectorDto.class);
	}

	@Override
	@Transactional
	public List<CompanyDto> getCompaniesBySectorId(Long sectorId) {
		// To be fetched from another Company Microservice
		return null;
	}

	@Override
	@Transactional
	public void addSector(SectorDto sectorDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		sectorRepository.save(modelMapper.map(sectorDto, SectorEntity.class));
	}

}
