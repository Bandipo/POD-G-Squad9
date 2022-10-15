package dtos;

import enums.ProductCategory;
import lombok.Data;

@Data
public class ProductRequest {

    private final ProductCategory productCategory;
    private final String productName;
    private final int quantity;

}
