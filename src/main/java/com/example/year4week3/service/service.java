package com.example.year4week3.service;

import com.example.year4week3.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    List<Product> Product = new ArrayList<>();

    public List<Product> GetProduct() {
        return Product;
    }

    public void addProduct(Product product) {
        Product.add(product);
    }

    public String UpdateProduct(Product product) {
        for (int i = 0; i < Product.size(); i++) {
            if (Product.get(i).getId() == product.getId()) {
                Product.get(i).setPrice(product.getPrice());
                Product.get(i).setName(product.getName());
                return "Product has been updated successfully";
            }
        }
        return "Could not find product";
    }

    public String deleteProduct(Product product) {
        for (int i = 0; i < Product.size(); i++) {
            if (Product.get(i).getId() == product.getId()) {
                Product.remove(i);
                return "Deleted it successfully";
            }
        }
        return "Did not delete";
    }
}
