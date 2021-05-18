package com.tihic.restourant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tihic.restourant.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}

