package com.example.productservice.controllers;

import com.example.productservice.DTOs.createProductRequestDTO;
import com.example.productservice.models.Product;
import com.example.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    public  ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody createProductRequestDTO product) {
        return productService.createProduct(product);
    }
}
