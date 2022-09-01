package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.model.request.ProductRequest;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/testing/")
public class SomeController {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;
    @PostMapping("registerProduct")
    public ResponseEntity<?> registerProduct(@Valid @RequestBody ProductRequest request) {
    try{
        Product product = new Product(
                request.getProductName(),
                request.getProductDescription(),
                request.getProductPrice()
        );

        Set<String> strCategories = request.getCategories();
        Set<Category> roles = new HashSet<>();

        strCategories.forEach(item -> {
            Category _category = categoryRepository.findByCategoryName(item).orElseThrow(() -> new RuntimeException(HttpStatus.NOT_FOUND+ "\nCategory Not Found!" +item ));
            roles.add(_category);
        });

        product.setCategories(roles);
        productRepository.save(product);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }catch(Exception e){
        System.err.println("The reason I failed is because "+ HttpStatus.I_AM_A_TEAPOT +"\nAs well as the following not important reason(s) : "+e.getMessage());
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
    }
}


