package com.example.year4week3.inter;

import com.example.year4week3.Entity.Product;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@FeignClient(name="TalktoInventory", url = "http://localhost:8080/Inventory")
public interface Communciation {

    @GetMapping("/getProducts")
    ArrayList<Product> getProduct();

    @PostMapping("/add")
     String AddProduct(@Valid @RequestBody Product product);
}
