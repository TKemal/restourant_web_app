package com.tihic.restourant.global;

import java.util.List;
import com.tihic.restourant.model.Product;
import java.util.ArrayList;


public class GlobalData {

    public static List<Product> cart;
    
    static {
        cart = new ArrayList<Product>();
    }
}

