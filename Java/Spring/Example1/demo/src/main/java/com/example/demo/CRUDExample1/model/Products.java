package com.example.demo.CRUDExample1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_ID")
    private Long productID;
    @Column(name = "product_name")
    private String productName;

    @Column(name = "category_ID")
    private Long categoryID;

    public Products() {
    }


    public Products(String productName, Long categoryID) {
        this.productName = productName;
        this.categoryID = categoryID;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", categoryID=" + categoryID +
                '}';
    }
}
