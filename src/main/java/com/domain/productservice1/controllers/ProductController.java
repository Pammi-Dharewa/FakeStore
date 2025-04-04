package com.domain.productservice1.controllers;

import com.domain.productservice1.models.Product;
import com.domain.productservice1.services.ProductService;
import com.domain.productservice1.services.SetDatabaseProductService;
import dtos.CreateProductRequestDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController

public class ProductController {

private ProductService productService;

private RestTemplate restTemplate;



public ProductController(ProductService productService, RestTemplate restTemplate) {
    this.productService = productService;
    this.restTemplate = restTemplate;
}

//    post/products
//    req body
//{
//    title: price: description
//
//}
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDTO request) {
        return productService.createProduct(
                request.getTitle(),
                request.getPrice(),
                request.getCategory(),
                request.getDescription(),
                request.getImage()
        );
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public void getAllProducts() {
        List<Product> products = productService.getAllProducts();

        throw new RuntimeException();
    }

    public void updateProduct() {

    }




}

