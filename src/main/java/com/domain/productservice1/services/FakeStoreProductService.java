package com.domain.productservice1.services;

import com.domain.productservice1.models.Product;
import dtos.FakeStoreProductsDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    //rest template
//    allows to send http req and work with response

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {

        FakeStoreProductsDTO fakeStoreProducts = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + productId,
                FakeStoreProductsDTO.class
        );
        return fakeStoreProducts.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct( String title,
                                  double price,
                                  String description,
                                  String category,
                                  String image) {

        FakeStoreProductsDTO fakeStoreProducts = new FakeStoreProductsDTO();
        fakeStoreProducts.setTitle(title);
        fakeStoreProducts.setPrice(price);
        fakeStoreProducts.setDescription(description);
        fakeStoreProducts.setCategory(category);
        fakeStoreProducts.setImage(image);

        FakeStoreProductsDTO response = restTemplate.postForObject(
                "https://fakestoreapi.com/products",
                fakeStoreProducts,
                FakeStoreProductsDTO.class
        );
        return response.toProduct();
    }
}
