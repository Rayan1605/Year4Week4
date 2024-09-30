package com.example.year4week3.Entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private int id;
    @Max(value = 1000, message = "Please lower the place")
    private double price;
    @NotBlank(message = "Please add something here")
    private String name;


}
