package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.StockExchangeDto;

@FeignClient("stockexchange-ms")
public interface StockExchangeServiceClient {
	
	@GetMapping("/id/{stockExchangeId}")
	public ResponseEntity<StockExchangeDto> getStockExchangeById(@PathVariable("stockExchangeId") Long stockExchangeId);
	
	@GetMapping("/name/{stockExchangeName}")
	public ResponseEntity<StockExchangeDto> getStockExchangeByName(@PathVariable("stockExchangeName") String stockExchangeName);
	
	@PostMapping("/")
	public ResponseEntity<StockExchangeDto> addStockExchange(@RequestBody StockExchangeDto stockExchangeDto);
	
}
