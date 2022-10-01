package repository;

import enums.ProductCategory;
import models.Cashier;
import models.Product;

import java.util.*;

public class StoreRepository {
    public static Map<ProductCategory, List<Product>> storeProducts = new HashMap<>();
    public static Set<Cashier> storeCashiers = new LinkedHashSet<>();


    public static Set<Cashier> getStoreCashiers() {
        return storeCashiers;
    }

    public static Map<ProductCategory, List<Product>> getStoreProducts() {
        return storeProducts;
    }
}
