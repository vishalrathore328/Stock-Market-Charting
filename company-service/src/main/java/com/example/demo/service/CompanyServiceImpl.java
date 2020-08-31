package com.example.demo.service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CompanyDao;
import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.IpoDetailsDto;
import com.example.demo.entity.Company;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	private CompanyDao companyDao;
	
	private ModelMapper modelMapper;

	public CompanyServiceImpl(CompanyDao companyDao, ModelMapper modelMapper) {
		this.companyDao = companyDao;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	public List<CompanyDto> getCompanyDetails() {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Type listType = new TypeToken<List<CompanyDto>>(){}.getType();
        List<CompanyDto> postDtoList = modelMapper.map(companyDao.findAll(),listType);
        return postDtoList;
	}
	
	@Override
	@Transactional
	public List<IpoDetailsDto> findByCompanyName(String name) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Type listType = new TypeToken<List<IpoDetailsDto>>(){}.getType();
        Optional<Company> company = companyDao.findByCompanyName(name);
        if(company.isPresent()) {
        	List<IpoDetailsDto> postDtoList = modelMapper.map(company.get().getIpoDetails(), listType);
        	return postDtoList;
        }
		return null;
	}

	@Override
	@Transactional
	public CompanyDto findCompanyById(String id) {
		// TODO Auto-generated method stub
		Optional<Company> company = companyDao.findByCompanyId(id);
		
		if(company.isPresent()) {
			modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			CompanyDto companyDto = modelMapper.map(company, CompanyDto.class);
			
			return companyDto;
		}
		return null;
	}

	@Override
	@Transactional
	public CompanyDto createCompany(CompanyDto companyDto) {
		// TODO Auto-generated method stub
		String str=UUID.randomUUID().toString();
        String str1[]=str.split("-");
        companyDto.setCompanyId(str1[0]);
        
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		companyDao.save(modelMapper.map(companyDto, Company.class));
		return companyDto;
	}

}
