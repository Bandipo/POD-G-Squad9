package models;


import java.util.ArrayList;
import java.util.List;

public class Customer {

    private  String customerId;
    private PersonDetails customerDetails;

    private final List<CartItem> cartItems = new ArrayList<>();

    public Customer(String customerId, PersonDetails customerDetails) {
        this.customerId = customerId;
        this.customerDetails = customerDetails;
    }

    public String getCustomerId() {
        return customerId;
    }

    public PersonDetails getUserDetails() {
        return customerDetails;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}
