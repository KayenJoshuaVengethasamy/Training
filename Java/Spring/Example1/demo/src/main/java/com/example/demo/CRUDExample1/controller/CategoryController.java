package com.example.demo.CRUDExample1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.demo.CRUDExample1.exception.ResourceNotFoundException;
import com.example.demo.CRUDExample1.model.Category;
import com.example.demo.CRUDExample1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/category/")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("getAllCategories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("getCategoryByID/{category_ID}")
    public ResponseEntity<Category> getCategoryByID(@PathVariable(value = "category_ID") Long categoryID) throws ResourceNotFoundException {
        Category categories = categoryRepository.findByCategoryID(categoryID).orElseThrow(() -> new ResourceNotFoundException("No category found for given ID : " + categoryID));
        return ResponseEntity.ok().body(categories);
    }

    @PostMapping("createCategory")
    public Category createCategory(@Valid @RequestBody Category category) {
        System.out.println(category.toString());
        return categoryRepository.save(category);
    }

    @PutMapping("updateCategory/{category_ID}")
    public ResponseEntity<Category> updateCategory(@PathVariable(value = "category_ID") Long categoryID,
                                                   @Valid @RequestBody Category categoryDetails) throws ResourceNotFoundException {
        Category category = categoryRepository.findByCategoryID(categoryID)
                .orElseThrow(() -> new ResourceNotFoundException("No category found for given ID : " + categoryID));

        category.setCategoryID(categoryDetails.getCategoryID());
        category.setCategoryName(categoryDetails.getCategoryName());
        category.setCategoryID(categoryDetails.getCategoryID());

        final Category updatedCategory = categoryRepository.save(category);
        ;
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping("deleteCategory/{category_ID}")
    public Map<String, Boolean> deleteCategory(@PathVariable(value = "category_ID") Long categoryID)
            throws ResourceNotFoundException {
        Category category = categoryRepository.findByCategoryID(categoryID).orElseThrow(() -> new ResourceNotFoundException("No category found for given ID : " + categoryID));
        categoryRepository.delete(category);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
