package uk.ac.westminster.lecture4.service;

import org.springframework.stereotype.Service;
import uk.ac.westminster.lecture4.dto.DigitalProduct;
import uk.ac.westminster.lecture4.dto.PhysicalProduct;
import uk.ac.westminster.lecture4.dto.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    //nextId++ — use the current value, then increment.
    //++nextId — increment first, then use the new value.
    private Long nextId = 1L;

    public ProductService() {
        System.out.println("ProductService constructor executed");
        products.add(new DigitalProduct(nextId++, "E-book",
                9.99, "/dl/1", 4.2));

        products.add(new PhysicalProduct(nextId++,
                "Monitor", 249.99, 5.4, "60x40"));
    }

    public List<Product> getProducts() {
        System.out.println("getProducts() called");
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId);
        nextId += 1L;
        products.add(product);
        return product;
    }
    public List<Product> findProductsByName(String name) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase()
                        .contains(name.toLowerCase()))
                .toList();
    }


}
