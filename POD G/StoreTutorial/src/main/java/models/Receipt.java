package models;

import java.math.BigDecimal;
import java.util.Set;

public class Receipt {
    private String receiptId;
    private Set<Item> items;
    private BigDecimal totalBill;
    private Customer customer;


    public Receipt(String receiptId, Set<Item> items, BigDecimal totalBill, Customer customer) {
        this.receiptId = receiptId;
        this.items = items;
        this.totalBill = totalBill;
        this.customer = customer;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public Set<Item> getItems() {
        return items;
    }

    public BigDecimal getTotalBill() {
        return totalBill;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptId='" + receiptId + '\'' +
                ", items=" + items +
                ", totalBill=" + totalBill +
                ", customer=" + customer +
                '}';
    }
}
