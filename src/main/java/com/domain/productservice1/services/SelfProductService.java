package com.domain.productservice1.services;

import com.domain.productservice1.models.Category;
import com.domain.productservice1.models.Product;
import com.domain.productservice1.repositories.CategoryRepository;
import com.domain.productservice1.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, double price, String description, String category, String image) {

        Product p = new Product();
        p.setTitle(title);
        p.setPrice(price);
        p.setDescription(description);
        p.setImagUrl(image);

        Category category1 = categoryRepository.findByTitle(category);

          if (category1 == null) {
            Category newCategory = new Category();
            newCategory.setTitle(category);
            category1 = newCategory;
        }

        p.setCategory(category1);

          Product savedProduct = productRepository.save(p);

        return savedProduct;
    }
}
