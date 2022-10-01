package models;

import enums.ProductCategory;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private int quantity;
    private ProductCategory productCategory;
    private BigDecimal price;
    private Set<String> brands;


    public Product(String name, int quantity, ProductCategory productCategory, BigDecimal price, Set<String> brands) {
        this.name = name;
        this.quantity = quantity;
        this.productCategory = productCategory;
        this.price = price;
        this.brands = brands;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductCategory getCategory() {
        return productCategory;
    }

    public void setCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Set<String> getBrands() {
        return brands;
    }

    public void setBrands(Set<String> brands) {
        this.brands = brands;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Objects.equals(name, product.name) && productCategory == product.productCategory && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, productCategory, price);
    }



//Todo override toString method


}
