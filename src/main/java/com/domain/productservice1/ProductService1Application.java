package com.domain.productservice1;

import com.domain.productservice1.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductService1Application {

    public static void main(String[] args) {

        Product p = new Product();


        SpringApplication.run(ProductService1Application.class, args);
    }

}
