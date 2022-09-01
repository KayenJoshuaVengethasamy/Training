package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/categories/")
@Transactional
public class CategoryController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("getAllCategories")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = new ArrayList<Category>();

        categoryRepository.findAll().forEach(categories::add);

        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("getAllcategoriesByProductID/{productsID}")
    public ResponseEntity<List<Category>> getAllcategoriesByProductID(@PathVariable(value = "productsID") Long productID) {
        if (!productRepository.existsById(productID)) {
            throw new ResourceNotFoundException("No Product with ID = " + productID);
        }

        List<Category> categories = categoryRepository.findCategoryByProducts(productID);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/get/categories/{categoryID}")
    public ResponseEntity<Category> getCategoriesByID(@PathVariable(value = "categoryID") Long categoryID) {
        Category category = categoryRepository.findByCategoryID(categoryID)
                .orElseThrow(() -> new ResourceNotFoundException("No Category with ID = " + categoryID));
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping("/categories/{categoryID}/product")
    public ResponseEntity<List<Product>> getAllProductsByCategoryID(@PathVariable(value = "categoryID") Long categoryID) {
        if (!categoryRepository.existsByCategoryID(categoryID)) {
            throw new ResourceNotFoundException("No Category with ID = " + categoryID);
        }

        List<Product> products = productRepository.findProductsByCategories(categoryID);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
//ResponseEntity<Category>
    @PostMapping("/products/{productsID}/categories")
    public void addCategory(@PathVariable(value = "productsID") Long productID, @RequestBody Category categoryRequest) {
//        Category category = productRepository.findByProductID(productID).map(product -> {
//            long categoryRequestId = categoryRequest.getCategoryID();
//            if (categoryRequestId != 0L) {
//                Category _category = categoryRepository.findById(categoryRequestId)
//                        .orElseThrow(() -> new ResourceNotFoundException("No Category with ID = " + categoryRequestId));
//                product.addCategories(_category);
//                productRepository.save(product);
//                return _category;
//            }
//            product.addCategories(categoryRequest);
//            return categoryRepository.save(categoryRequest);
//        }).orElseThrow(() -> new ResourceNotFoundException("No Product with ID = " + productID));
//
//        return new ResponseEntity<>(category, HttpStatus.CREATED);
        System.out.println("HELLO WORLD");
        System.out.println("here is your ID : "+productID);
        System.out.println("here is your categories : "+categoryRequest.toString());
    }

    @PutMapping("/update/categories/{categoryID}")
    public ResponseEntity<Category> updateCategory(@PathVariable("categoryID") long categoryID, @RequestBody Category categoryRequest) {
        Category category = categoryRepository.findByCategoryID(categoryID)
                .orElseThrow(() -> new ResourceNotFoundException("categoryID " + categoryID + "not found"));

        category.setCategoryName(categoryRequest.getCategoryName());

        return new ResponseEntity<>(categoryRepository.save(category), HttpStatus.OK);
    }

    @DeleteMapping("/product/{productID}/categories/{categoryID}")
    public ResponseEntity<HttpStatus> deleteCategoryFromProduct(@PathVariable(value = "productID") Long productID, @PathVariable(value = "categoryID") Long categoryID) {
        Product product = productRepository.findByProductID(productID)
                .orElseThrow(() -> new ResourceNotFoundException("Not Product with ID = " + productID));

        product.removeCategories(categoryID);
        productRepository.save(product);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/categories/{categoryID}")
    public ResponseEntity<HttpStatus> deleteCategory(@PathVariable("categoryID") long categoryID) {
        try{
            categoryRepository.deleteByCategoryID(categoryID);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            System.err.println("Message: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}