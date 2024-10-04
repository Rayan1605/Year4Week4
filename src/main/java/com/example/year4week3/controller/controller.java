package com.example.year4week3.controller;


import com.example.year4week3.Entity.Product;
import com.example.year4week3.inter.Communciation;
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

    @GetMapping("/GET")
    public List<Product> GetProduct(){
        return communciation.getProduct();
    }

    @PostMapping("/add")
    public String AddProduct(@Valid @RequestBody Product product){
     return communciation.AddProduct(product);
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
