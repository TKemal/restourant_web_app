package com.tihic.restourant.service;

import com.tihic.restourant.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tihic.restourant.model.Category;
import java.util.Optional;

@Service
public class CategoryService {
    
    @Autowired
    CategoryRepository categoryRepository;
    
    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
    
    public void addCategory(Category category){
     categoryRepository.save(category);
    }
    
    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }
    
    public Optional<Category> getCategoryByID(int id){
        return categoryRepository.findById(id);
    }
            
}
