package com.example.demo.controller;


import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products/")
@Transactional
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam(required = false) String productName) {
        List<Product> products = new ArrayList<Product>();

        if (productName == null)
            productRepository.findAll().forEach(products::add);
        else
            productRepository.findByProductNameContaining(productName).forEach(products::add);

        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/{productID}")
    public ResponseEntity<Product> getProductByID(@PathVariable("productID") long productID) {
        Product product = productRepository.findByProductID(productID)
                .orElseThrow(() -> new ResourceNotFoundException("No Product with ID = " + productID));
        return new ResponseEntity<>(product, HttpStatus.OK);
    }


    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product _product = productRepository.save(new Product(product.getProductName(), product.getProductDescription(), product.getProductPrice()));
        System.out.println(product.toString());
        return new ResponseEntity<>(_product, HttpStatus.CREATED);
    }

    @PutMapping("/products/{productID}")
    public ResponseEntity<Product> updateProduct(@PathVariable("productID") long productID, @RequestBody Product product) {
        Product _product = productRepository.findById(productID)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Product with id = " + productID));

        _product.setProductName(product.getProductName());
        _product.setProductDescription(product.getProductDescription());
        _product.setProductPrice(product.getProductPrice());

        return new ResponseEntity<>(productRepository.save(_product), HttpStatus.OK);
    }

    @DeleteMapping("/products/{productID}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("productID") long productID) {
        try {
            productRepository.deleteByProductID(productID);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            System.err.println("Message: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @DeleteMapping("/products")
    public ResponseEntity<HttpStatus> deleteAllProducts() {
        productRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @GetMapping("/products/name")
//    public ResponseEntity<List<Product>> findByName() {
//        List<Product> products = productRepository.findByProductName(true);
//
//        if (products.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//
//        return new ResponseEntity<>(products, HttpStatus.OK);
//    }
}