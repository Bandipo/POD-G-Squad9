package baog.models;

import baog.UserDetails;

public class Customer {

    private  String customerId;
    private UserDetails userDetails;

    public Customer(String customerId, UserDetails userDetails) {
        this.customerId = customerId;
        this.userDetails = userDetails;
    }

    public String getCustomerId() {
        return customerId;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }
}
