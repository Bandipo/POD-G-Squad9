package baog;

import baog.enums.Category;
import baog.models.Cashier;
import baog.models.Product;

import java.util.*;

public class Store {

 public static Map<Category, List<Product>> storeProducts;
  public static  Set<Cashier> storeCashiers = new HashSet<>();

  static {
      storeProducts = new HashMap<>();
  }

    public static Set<Cashier> getStoreCashiers() {
        return storeCashiers;
    }
}
