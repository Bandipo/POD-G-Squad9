package models;


import enums.ProductCategory;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItem {
    private final String productName;
    private final int productQuantity;
    private final BigDecimal productPrice;
    private final ProductCategory productCategory;
}
