package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockExchangeEntity;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchangeEntity, Long> {

	public StockExchangeEntity findByStockExchangeName(String stockExchangeName);
	
}
