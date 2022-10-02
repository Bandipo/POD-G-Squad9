package repository;

import enums.ProductCategory;
import models.Cashier;
import models.Product;

import java.util.*;

public class StoreRepository {
    public static Map<ProductCategory, List<Product>> storeProducts = new HashMap<>();
    public static Set<Cashier> storeCashiers = new LinkedHashSet<>();


    static {

        for(ProductCategory productCategory: ProductCategory.values()){
            storeProducts.put(productCategory, new LinkedList<>());
        }

    }

    public static Set<Cashier> getStoreCashiers() {
        return storeCashiers;
    }

    public static Map<ProductCategory, List<Product>> getStoreProducts() {
        return storeProducts;
    }
}
