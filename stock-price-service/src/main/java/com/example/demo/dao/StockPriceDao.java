package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockPriceEntity;

@Repository
public interface StockPriceDao extends JpaRepository<StockPriceEntity, Long>{

}
