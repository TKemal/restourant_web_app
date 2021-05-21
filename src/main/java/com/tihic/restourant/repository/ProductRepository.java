package com.tihic.restourant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tihic.restourant.model.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long>{
    
    List<Product> findAllByCategory_Id(int id);
}
