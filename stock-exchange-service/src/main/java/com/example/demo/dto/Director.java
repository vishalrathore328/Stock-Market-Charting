package com.example.demo.dto;

public class Director {
	
	private Long directorId;
	
	private String directorName;

	public Director(Long directorId, String directorName) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
	}

	public Long getDirectorId() {
		return directorId;
	}

	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

}
