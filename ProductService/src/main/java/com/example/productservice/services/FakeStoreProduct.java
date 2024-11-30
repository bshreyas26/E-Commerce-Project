package com.example.productservice.services;

import com.example.productservice.DTOs.FakeProductDTO;
import com.example.productservice.DTOs.createProductRequestDTO;
import com.example.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProduct implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProduct(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(long id) {
        FakeProductDTO fakeProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductDTO.class);
        return fakeProductDTO.toProduct();
    }

    @Override
    public Product createProduct(createProductRequestDTO product) {
        return null;
    }
}
