package com.domain.productservice1.repositories;

import com.domain.productservice1.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);

    Category save(Category category);
}
