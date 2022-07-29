package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_ID")
    private long productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_price")
    private int productQuantity;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "product_categories",
            joinColumns = {@JoinColumn(name = "product_ID")},
            inverseJoinColumns = {@JoinColumn(name = "category_ID")})
    private Set<Category> categories = new HashSet<>();

    public Product() {

    }

    public Product(String productName, String productDescription, int productQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
    }

    public Product(String productName, String productDescription, int productQuantity, Set<Category> categories) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.categories = categories;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public void addCategories(Category category) {
        this.categories.add(category);
        category.getProducts().add(this);
    }

    public void removeCategories(long categoriesId) {
        Category category = this.categories.stream().filter(t -> t.getCategoryID() == categoriesId).findFirst().orElse(null);
        if (category != null) {
            this.categories.remove(category);
            category.getProducts().remove(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productQuantity=" + productQuantity +
                ", categories=" + categories +
                '}';
    }
}