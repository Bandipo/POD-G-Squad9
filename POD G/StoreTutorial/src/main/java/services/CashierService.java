package services;

import models.Cashier;
import models.Customer;

public interface CashierService {

    String sellProductToCustomer(Customer customer, Cashier cashier);


}
