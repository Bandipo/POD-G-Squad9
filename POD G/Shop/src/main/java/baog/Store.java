package baog;

import baog.models.Cashier;

import java.util.HashSet;
import java.util.Set;

public class Store {
  public static  Set<Cashier> storeCashiers = new HashSet<>();

    public static Set<Cashier> getStoreCashiers() {
        return storeCashiers;
    }
}
