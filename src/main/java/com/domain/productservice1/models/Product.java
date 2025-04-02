package com.domain.productservice1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private String imagUrl;

    private Category category;


}
