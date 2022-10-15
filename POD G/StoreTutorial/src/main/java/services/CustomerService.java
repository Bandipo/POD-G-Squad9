package services;

import dtos.ProductRequest;
import lombok.NonNull;
import models.Customer;

public interface CustomerService {

    String addProductToCart(@NonNull Customer customer,  @NonNull ProductRequest productRequest);
}
