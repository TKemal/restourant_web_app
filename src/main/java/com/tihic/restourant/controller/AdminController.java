package com.tihic.restourant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tihic.restourant.model.Category;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    
    @GetMapping("/admin/categories")
    public String getCat(){
        return "categories";
    }
    
    @GetMapping("/admin/categories/add")
    public String getCatAdd(Model model){
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }
    
     @PostMapping("/admin/categories/add")
    public String postCatAdd(@ModelAttribute("category")Category category){
        return "categoriesAdd";
    }
}
