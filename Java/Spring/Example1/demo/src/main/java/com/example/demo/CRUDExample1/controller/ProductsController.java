package com.example.demo.CRUDExample1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.demo.CRUDExample1.exception.ResourceNotFoundException;
import com.example.demo.CRUDExample1.model.Products;
import com.example.demo.CRUDExample1.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/products/")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("getAllProducts")
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @GetMapping("getProductByID/{product_ID}")
    public ResponseEntity<Products> getProductByID(@PathVariable(value = "product_ID") Long productID) throws ResourceNotFoundException {
        Products products = productsRepository.findByProductID(productID).orElseThrow(() -> new ResourceNotFoundException("No Product found for given ID : " + productID));
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("createProduct")
    public Products createProduct(@Valid @RequestBody Products products) {
        System.out.println(products.toString());
        return productsRepository.save(products);
    }

    @PutMapping("updateProduct/{product_ID}")
    public ResponseEntity<Products> updateProduct(@PathVariable(value = "product_ID") Long productID,
                                                  @Valid @RequestBody Products productDetails) throws ResourceNotFoundException {
        Products product = productsRepository.findByProductID(productID)
                .orElseThrow(() -> new ResourceNotFoundException("No Product found for given ID : " + productID));

        product.setProductID(productDetails.getProductID());
        product.setProductName(productDetails.getProductName());
        product.setCategoryID(productDetails.getCategoryID());

        final Products updatedProduct = productsRepository.save(product);
        ;
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("deleteProduct/{product_ID}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "product_ID") Long productID)
            throws ResourceNotFoundException {
        Products product = productsRepository.findByProductID(productID).orElseThrow(() -> new ResourceNotFoundException("No Product found for given ID : " + productID));
        productsRepository.delete(product);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
