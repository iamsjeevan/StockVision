package com.stockvision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockvision.model.StockEntity;
import com.stockvision.repository.StockRepository;

import jakarta.annotation.PostConstruct;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @PostConstruct
    public void testConnection() {
        StockEntity stock = new StockEntity();
        stock.setName("Test Stock");
        stock.setSymbol("TST");

        stockRepository.save(stock);
        System.out.println("Database connection successful! Stock saved.");
    }
}
