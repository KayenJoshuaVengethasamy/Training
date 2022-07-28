package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findCategoryByProducts(Long productID);
    Optional<Category> findByCategoryID(Long categoryID);
    boolean existsByCategoryID(Long categoryID);
    void deleteByCategoryID(Long categoryID);

}