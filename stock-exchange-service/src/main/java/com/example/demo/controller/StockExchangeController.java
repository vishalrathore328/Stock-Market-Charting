package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;
import com.example.demo.service.StockExchangeService;

@RestController
@RequestMapping("/stockexchange")
public class StockExchangeController {

	@Autowired
	private StockExchangeService stockExchangeService;

	public StockExchangeController(StockExchangeService stockExchangeService) {
		super();
		this.stockExchangeService = stockExchangeService;
	}
	
	@GetMapping("/id/{stockExchangeId}")
	public ResponseEntity<StockExchangeDto> getStockExchangeById(@PathVariable("stockExchangeId") Long stockExchangeId){
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.getStockExchangeById(stockExchangeId), HttpStatus.FOUND);
	}
	
	@GetMapping("/name/{stockExchangeName}")
	public ResponseEntity<StockExchangeDto> getStockExchangeByName(@PathVariable("stockExchangeName") String stockExchangeName){
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.getStockExchangeByName(stockExchangeName), HttpStatus.FOUND);
	}
	
	@PostMapping("/")
	public ResponseEntity<StockExchangeDto> addStockExchange(@RequestBody StockExchangeDto stockExchangeDto){
		stockExchangeService.addStockExchange(stockExchangeDto);
		return new ResponseEntity<StockExchangeDto>(HttpStatus.CREATED);
	}
}
