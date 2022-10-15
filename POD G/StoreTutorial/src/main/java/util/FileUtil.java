package util;

import enums.ProductCategory;
import models.Product;
import repository.StoreRepository;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FileUtil {

    public static  void readProductFromCsvFile(String resourcePath){
        Path path = Paths.get(resourcePath);
        Executor executor = Executors.newSingleThreadExecutor();

        CompletableFuture.runAsync(() -> {
            loadProductFromFile(path);

        }, executor).thenRun(()->{
            StoreRepository.getAllShopProducts().forEach(System.out::println);
        });
    }

    private static void createAndAddProductToShopStore(String[] productDetails) {

        Product product = createProductFromFile(productDetails);
        ProductCategory category = product.getProductCategory();

        List<Product> products = StoreRepository.getProductCategoryToProductsMap().get(category);


        if (products.contains(product)) {
            updateProductInShopStore(products, category, product);
        } else {
            addProductToShopStore(category, product);
        }

    }

    private static void updateProductInShopStore(List<Product> products, ProductCategory category, Product product){
        Product previousProductInventory = products.get(products.indexOf(product));

        int previousProductInventoryQuantity = previousProductInventory.getQuantity();
        BigDecimal previousProductInventoryPrice = previousProductInventory.getPrice();

        int incomingProductQuantity = product.getQuantity();
        BigDecimal incomingProductPrice = product.getPrice();

        int currentProductQuantity =  previousProductInventoryQuantity + incomingProductQuantity;
        BigDecimal currentProductPrice = Objects.equals(previousProductInventoryPrice, incomingProductPrice) ? previousProductInventoryPrice : incomingProductPrice;

        previousProductInventory.setQuantity(currentProductQuantity);
        previousProductInventory.setPrice(currentProductPrice);

        StoreRepository.getProductCategoryToProductsMap().get(category).remove(products.indexOf(product));
        StoreRepository.getProductCategoryToProductsMap().get(category).add(previousProductInventory);
    }

    private static void addProductToShopStore(ProductCategory category,Product product){
        StoreRepository.getProductCategoryToProductsMap().get(category).add(product);
    }

    private static Product createProductFromFile(String[] productDetails){
        ProductCategory category = ProductCategory.valueOf(productDetails[0].toUpperCase());

        String productName = productDetails[1];
        int quantity = Integer.parseInt(productDetails[2]);
        BigDecimal price = new BigDecimal(productDetails[3]);

        return new Product(category, productName, quantity, price);
    }

    private static void loadProductFromFile(Path path) {
        try (Stream<String> lines = Files.lines(path)) {

            lines.map(line -> line.split(","))
                    .filter(productDetails -> ProductCategory.getExpectedCategories().contains(productDetails[0].toUpperCase()))
                    .forEach(FileUtil::createAndAddProductToShopStore);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
