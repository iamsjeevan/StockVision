package com.stockvision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockvision.repository.StockRepository;

@RestController
@RequestMapping("/api/db")
public class DatabaseCheckController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/check")
    public String checkDbConnection() {
        long count = stockRepository.count();
        return "Database connected! Total stocks: " + count;
    }
}
