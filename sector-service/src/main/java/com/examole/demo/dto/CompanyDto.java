package com.examole.demo.dto;

import java.util.HashSet;
import java.util.Set;

public class CompanyDto {
	
	private Long companyId;
	
	private String companyName;
	
	private String companyCode;
	
	private String companyCeo;
	
	private Set<Director> directors = new HashSet<>();
	
	private Set<String> listedInStockExchanges = new HashSet<>();
	
	private String sectorName;
	
	private float turnover;
	
	private String about;
	
	public CompanyDto() {
		
	}

	public CompanyDto(Long companyId, String companyName, String companyCode, String companyCeo,
			Set<Director> directors, Set<String> listedInStockExchanges, String sectorName, float turnover,
			String about) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyCode = companyCode;
		this.companyCeo = companyCeo;
		this.directors = directors;
		this.listedInStockExchanges = listedInStockExchanges;
		this.sectorName = sectorName;
		this.turnover = turnover;
		this.about = about;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCeo() {
		return companyCeo;
	}

	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}

	public Set<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}

	public Set<String> getListedInStockExchanges() {
		return listedInStockExchanges;
	}

	public void setListedInStockExchanges(Set<String> listedInStockExchanges) {
		this.listedInStockExchanges = listedInStockExchanges;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public float getTurnover() {
		return turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
}
