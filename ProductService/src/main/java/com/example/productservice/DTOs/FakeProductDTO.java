package com.example.productservice.DTOs;

import com.example.productservice.models.Category;
import com.example.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductDTO {
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;


    public Product toProduct() {
        Product product = new Product();
        product.setName(this.title);
        product.setDescription(this.description);
        product.setPrice(this.price);

        Category category = new Category();
        category.setTitle(this.category);

        product.setCategory(category);
        product.setImage(this.image);
        return product;
    }
}
