package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Product;

import com.example.demo.repository.ProductRepository;


public class ProductController {
	 @Autowired
	    ProductRepository productRepository;
	    @ResponseBody
	    @RequestMapping(value = "/products")
	    public List<Product> getCategoryDetails() {
	        List<Product> productresponse = (List<Product>) productRepository.findAll();
	        return productresponse;
	    }
	
}
