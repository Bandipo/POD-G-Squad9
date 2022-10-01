package models;



public class Customer {

    private  String customerId;
    private PersonDetails customerDetails;

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
}
