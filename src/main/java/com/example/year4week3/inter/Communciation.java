package com.example.year4week3.inter;

import com.example.year4week3.Entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(name="TalktoInventory", url = "http://localhost:8080")
public interface Communciation {

    @GetMapping("/getProducts")
    ArrayList<Product> getProduct();


}
