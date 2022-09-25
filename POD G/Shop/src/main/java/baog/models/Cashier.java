package baog.models;

import baog.UserDetails;

public class Cashier {

    private  String cashierId;
    private UserDetails userDetails;

    public Cashier(String cashierId, UserDetails userDetails) {
        this.cashierId = cashierId;
        this.userDetails = userDetails;
    }

    public String getCashierId() {
        return cashierId;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }
}
