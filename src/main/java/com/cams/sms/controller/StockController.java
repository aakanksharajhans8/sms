package com.cams.sms.controller;

import com.cams.sms.dto.Stock;
import com.cams.sms.service.StockService;
import com.cams.sms.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock-api")
public class StockController {
    StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/stocks")
    public Stock createPost(@RequestBody Stock stock){
        //connect to StockService
        //StockServiceImpl stockService = new StockServiceImpl();
        Stock s = stockService.addPost(stock);
        return s;
    }
    @GetMapping("/stocks")
    public List<Stock> getAllStocks(){
        return stockService.getAllStocks();
    }
    //@GetMapping("/stocks/stockId")---static path
    @GetMapping("/stocks/{stockId}")//---dynamic path
    public Stock getAllStockById(@PathVariable("stockId") int sId){
        System.out.println(sId);
        return stockService.getStockById(sId);
    }

    @PutMapping("/stocks")
    public Stock updateStocks(@RequestBody Stock stock){
        return stockService.updateStock(stock);
    }
}
