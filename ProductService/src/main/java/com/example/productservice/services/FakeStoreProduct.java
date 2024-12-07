package com.example.productservice.services;

import com.example.productservice.DTOs.FakeProductDTO;
import com.example.productservice.DTOs.createProductRequestDTO;
import com.example.productservice.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProduct implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProduct(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        FakeProductDTO[] fakeProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products", FakeProductDTO[].class);
        for(FakeProductDTO fakeProductDTO1 : fakeProductDTO) {
            products.add(fakeProductDTO1.toProduct());
        }
        return products;
    }

    @Override
    public Product getProduct(long id) {
        ResponseEntity<FakeProductDTO> fakeProductDTOResponseEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, FakeProductDTO.class);
        FakeProductDTO fakeProductDTO = fakeProductDTOResponseEntity.getBody();
        return fakeProductDTO.toProduct();
    }

    @Override
    public Product createProduct(createProductRequestDTO product)
    {
        FakeProductDTO fakeProductDTO = restTemplate.postForObject("https://fakestoreapi.com/products", product, FakeProductDTO.class);
        return fakeProductDTO.toProduct();
    }
}
