package com.stockvision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockvision.model.StockEntity;

@Repository
public interface StockRepository extends JpaRepository<StockEntity, Long> {
}
