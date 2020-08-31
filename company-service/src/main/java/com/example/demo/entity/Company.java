package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "company_id")
	private String companyId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "turnover")
	private float turnover;
	@Column(name = "ceo")
	private String ceo;
	@Column(name = "sector")
	private String sector;
	@Column(name = "brief_writeup")
	private String briefWriteUp;
	
	private String[] boardOfDirectors = new String[3];
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id",nullable = false)
	private List<IpoDetails> ipoDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
