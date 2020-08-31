package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.IpoDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
	private String companyId;
	private String companyName;
	private float turnover;
	private String ceo;
	private String sector;
	private String briefWriteUp;
	private String[] boardOfDirectors = new String[3];
	private List<IpoDetails> ipoDetails;
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}
	public String[] getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String[] boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public List<IpoDetails> getIpoDetails() {
		return ipoDetails;
	}
	public void setIpoDetails(List<IpoDetails> ipoDetails) {
		this.ipoDetails = ipoDetails;
	}
	
}
