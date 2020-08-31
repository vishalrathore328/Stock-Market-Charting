package com.examole.demo.dto;

public class StockExchangeDto {
	
	private Long stockExchangeId;
	
	private String stockExchangeName;
	
	private String brief;
	
	private String address;
	
	private String remarks;
	
	public StockExchangeDto() {
		
	}

	public StockExchangeDto(Long stockExchangeId, String stockExchangeName, String brief, String address,
			String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
	}

	public Long getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(Long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
