package com.example.napptilus.rest;

import com.example.napptilus.model.entity.Price;
import com.example.napptilus.model.service.IPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="price")
public class PriceController {

    @Autowired
    private IPriceService priceService;

    @GetMapping(value="getPrice")
    public List<Price> getPrice() {
        return priceService.getPrices();
    }

}
