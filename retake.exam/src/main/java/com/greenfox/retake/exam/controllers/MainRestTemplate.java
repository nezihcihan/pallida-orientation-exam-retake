package com.greenfox.retake.exam.controllers;


import com.greenfox.retake.exam.models.ApiResponse;
import com.greenfox.retake.exam.models.Product;
import com.greenfox.retake.exam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MainRestTemplate {



    @Autowired
    ProductRepository productRepository;

    @GetMapping("/warehouse/query")
    public ApiResponse findClothes(@RequestParam float price,@RequestParam String type){
        List<Product> productList = new ArrayList<>();
        if(type.equals("higher")) {
           productList = productRepository.findAllByPriceIsGreaterThan(price);
        }
        else if (type.equals("lower")) {
            productList = productRepository.findAllByPriceIsLessThan(price);
        }
        else if (type.equals("equal")) {
            productList = productRepository.findAllByPriceEquals(price);
        }
        return new ApiResponse("ok", productList);
    }
}
