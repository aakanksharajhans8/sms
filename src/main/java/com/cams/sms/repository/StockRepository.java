package com.cams.sms.repository;

import com.cams.sms.dto.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Integer> {
}
