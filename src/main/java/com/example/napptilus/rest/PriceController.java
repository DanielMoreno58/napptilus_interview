package com.example.napptilus.rest;

import com.example.napptilus.model.entity.Price;
import com.example.napptilus.model.service.IPriceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "knows how receive manage user requests")
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
