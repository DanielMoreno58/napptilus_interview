package com.example.napptilus.model.service;

import com.example.napptilus.model.dao.IPriceDao;
import com.example.napptilus.model.entity.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService implements IPriceService {

    @Autowired
    private IPriceDao priceDao;

    public List<Price> getPrices() {
        return (List<Price>) priceDao.findAll();
    }

}
