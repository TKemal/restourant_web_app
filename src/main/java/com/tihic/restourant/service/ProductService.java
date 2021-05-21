package com.tihic.restourant.service;

import java.util.List;
import com.tihic.restourant.model.Product;
import com.tihic.restourant.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}