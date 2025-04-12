package com.domain.productservice1.services;

import com.domain.productservice1.models.Product;

import java.util.List;


public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct(
            String title,
            double price,
            String description,
            String category,
            String image
    );



}
