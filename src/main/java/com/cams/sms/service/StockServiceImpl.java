package com.cams.sms.service;

import com.cams.sms.dto.Stock;
import com.cams.sms.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService{
    StockRepository stockRepository;
    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public List<Stock> getAllStocks() {
        List<Stock> ss = stockRepository.findAll();
        return ss;
    }

    @Override
    public Stock addPost(Stock stock) {
        //simple jpa repository
        //SimpleJpaRepository simpleJpaRepository = new SimpleJpaRepository();
        //JpaRepository simpleJpaRepository = new SimpleJpaRepository();
        Stock s = stockRepository.save(stock);
        //call save method
        return s;
    }

    @Override
    public Stock getStockById(int stockId) {
        Optional<Stock> optionalStock = stockRepository.findById(stockId);
        if(optionalStock.isPresent()){
            return optionalStock.get();
        }
        return null; //throw StackIdDoesNotExistException
    }

    @Override
    public Stock updateStock(Stock stock) {
        //stockId available then update else it'll create new entry
        if(stockRepository.existsById(stock.getId())){
            return stockRepository.save(stock);
        }
        return null; //throw StockUpdateFailedException
    }

}
