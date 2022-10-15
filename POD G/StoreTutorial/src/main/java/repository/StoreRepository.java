package repository;

import enums.ProductCategory;
import models.Cashier;
import models.Customer;
import models.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreRepository {
    public static Map<ProductCategory, List<Product>> productCategoryToProductsMap = new HashMap<>();
    public static Set<Cashier> storeCashiers = new LinkedHashSet<>();

    public static Queue<Customer> fifoCustomerQueue = new LinkedList<>();

    public static Queue<Customer> customerPriorityQueue = new PriorityQueue<>();



    static {

        for(ProductCategory productCategory: ProductCategory.values()){
            productCategoryToProductsMap.put(productCategory, new ArrayList<>());
        }

    }

    public static Set<Cashier> getStoreCashiers() {
        return storeCashiers;
    }

    public static Map<ProductCategory, List<Product>> getProductCategoryToProductsMap() {
        return productCategoryToProductsMap;
    }

    public static List<Product> getAllShopProducts(){

       return productCategoryToProductsMap.values()
                .stream()
                .flatMap(products -> products.stream())
                .collect(Collectors.toList());
    }
}
