package baog.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private String productName;
    private int quantity;
    private BigDecimal totalPrice;

    public Item(String productName, int quantity, BigDecimal totalPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return quantity == item.quantity && Objects.equals(productName, item.productName) && Objects.equals(totalPrice, item.totalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, totalPrice);
    }


    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
