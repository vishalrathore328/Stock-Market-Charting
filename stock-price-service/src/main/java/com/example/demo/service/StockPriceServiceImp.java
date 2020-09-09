package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.StockPriceDao;
import com.example.demo.entity.StockPriceEntity;


@Service
public class StockPriceServiceImp implements StockPriceService{
	
	private StockPriceDao stockPriceDao;
	
	public StockPriceServiceImp(StockPriceDao stockPriceDao) {
		super();
		this.stockPriceDao = stockPriceDao;
	}

	@Override
	@Transactional
	public void save(MultipartFile file) throws RuntimeException{
		try {
			List<StockPriceEntity> stockPriceList = ExcelHelper.excelToStockPriceEntity(file.getInputStream());
			stockPriceDao.saveAll(stockPriceList);
		} catch (IOException e) {
			throw new RuntimeException("fail to store excel data: " + e.getMessage());
		}
	}
}
