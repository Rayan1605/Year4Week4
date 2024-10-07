package com.example.year4week3.controller;


import com.example.year4week3.Entity.Product;
import com.example.year4week3.inter.Communciation;
import com.example.year4week3.inter.JpaRepo;
import com.example.year4week3.service.service;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Product")
public class controller {

    private service functions;

    private Communciation communciation;
    private JpaRepo jpaRepo;

    @GetMapping("/GET")
    public List<Product> GetProduct(){
        return functions.GetProduct();
    }

    @PostMapping("/add")
    public String AddProduct(@Valid @RequestBody Product product){
     return functions.addProduct(product);
    }
    @PutMapping("/update")
    public String UpdateProduct(@RequestBody Product product){
        return functions.UpdateProduct(product);
    }
    @PutMapping("/delete")
    public String DeleteProduct(@RequestBody Product product){
        return functions.deleteProduct(product);
    }


}
