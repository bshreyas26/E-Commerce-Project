package com.example.productservice;

import com.example.productservice.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {

        Product p1 = new Product();


        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
