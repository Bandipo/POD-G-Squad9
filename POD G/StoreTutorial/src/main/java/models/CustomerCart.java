package models;


import java.util.LinkedHashSet;
import java.util.Set;

public class CustomerCart {


  volatile private Set<CartItem> cartItems = new LinkedHashSet<>();
}
