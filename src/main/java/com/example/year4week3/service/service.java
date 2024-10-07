package com.example.year4week3.service;

import com.example.year4week3.Entity.Product;
import com.example.year4week3.inter.JpaRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class service {

    List<Product> Product = new ArrayList<>();
    private JpaRepo jpaRepo;

    public List<Product> GetProduct() {
        return jpaRepo.findAll();
    }

    public String addProduct(Product product) {
        jpaRepo.save(product);
        return "It saved the product";
    }

    public String UpdateProduct(Product product) {

       /*
        for (int i = 0; i < Product.size(); i++) {
            if (Product.get(i).getId() == product.getId()) {
                Product.get(i).setPrice(product.getPrice());
                Product.get(i).setName(product.getName());
                return "Product has been updated successfully";
            }
        }
        return "Could not find product";
      */
        jpaRepo.save(product);
        return "Could not find product";
    }

    public String deleteProduct(Product product) {
        /*
        for (int i = 0; i < Product.size(); i++) {
            if (Product.get(i).getId() == product.getId()) {
                Product.remove(i);
                return "Deleted it successfully";
            }
        }
        return "Did not delete";
    }
    */
        jpaRepo.delete(product);
        return "Deleted it successfully";
    }
}
