package com.example.productservice.services;

import com.example.productservice.DTOs.createProductRequestDTO;
import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProduct(long id);
    Product createProduct(createProductRequestDTO product);
}
