package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);

    List<Product> findByProductNameContaining(String productName);

    List<Product> findProductsByCategories(Long categoryID);

    Optional<Product> findByProductID(Long productID);

    void deleteByProductID(Long productID);
}