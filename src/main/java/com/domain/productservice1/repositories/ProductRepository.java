package com.domain.productservice1.repositories;

import com.domain.productservice1.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product p);
}
