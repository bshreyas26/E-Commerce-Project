package com.example.productservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class createProductRequestDTO {
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
