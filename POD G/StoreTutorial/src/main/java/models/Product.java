package models;

import enums.ProductCategory;

import java.math.BigDecimal;
import java.util.Objects;


public class Product {

    private ProductCategory productCategory;
    private String productName;
    private int quantity;
    private BigDecimal price;;

    public Product(ProductCategory productCategory, String productName) {
        this.productCategory = productCategory;
        this.productName = productName;
    }

    public Product(ProductCategory productCategory, String productName, int quantity, BigDecimal price) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }






    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productCategory == product.productCategory && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategory, productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCategory=" + productCategory +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}
