package com.example.demo.CRUDExample1.repository;

import com.example.demo.CRUDExample1.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Optional<Products> findByProductID(Long productID);
}
