package dtos;

import com.domain.productservice1.models.Category;
import com.domain.productservice1.models.Product;
import com.domain.productservice1.services.ProductService;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter


public class FakeStoreProductsDTO implements ProductService {

    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    public Product toProduct(){

        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImagUrl(image);

        Category productCategory = new Category();

        productCategory.setTitle(category);
        product.setCategory(productCategory);

        return product;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, double price, String description, String category, String image) {
        return null;
    }
}
