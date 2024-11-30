package com.example.productservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class createProductRequestDTO {
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
}
