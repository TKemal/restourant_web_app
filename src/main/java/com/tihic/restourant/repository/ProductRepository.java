package com.tihic.restourant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tihic.restourant.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
