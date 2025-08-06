package com.cams.sms.service;

import com.cams.sms.dto.Stock;

import java.util.List;

public interface StockService {
    public Stock addPost(Stock stock);
    public List<Stock> getAllStocks();
    public Stock getStockById(int stockId);
    public Stock updateStock(Stock stock);
}
