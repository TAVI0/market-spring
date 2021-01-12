package com.tavio.market.domain.repository;

import com.tavio.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScareseProducts(int quantity);
    Optional<Product> getProduct(int productID);
    Product save(Product product);
    void delete(int productId);
}

