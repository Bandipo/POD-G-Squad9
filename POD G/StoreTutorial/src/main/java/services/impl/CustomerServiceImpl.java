package services.impl;

import dtos.ProductRequest;
import exceptions.ProductException;
import exceptions.ServiceException;
import lombok.NonNull;
import models.CartItem;
import models.Customer;
import models.Product;
import repository.StoreRepository;
import services.CustomerService;

public class CustomerServiceImpl implements CustomerService {



    @Override
    public String addProductToCart(@NonNull Customer customer, @NonNull ProductRequest productRequest) {

        Product product = new Product(productRequest.getProductCategory(), productRequest.getProductName());

        boolean isProductExist = StoreRepository.getAllShopProducts().contains(product);

        if(!isProductExist){
            throw new ProductException("Product Not Available");
        }


        int productIndex = StoreRepository.getAllShopProducts().indexOf(product);

        Product foundProduct = StoreRepository.getAllShopProducts().get(productIndex);

        boolean isProductQuantityEnough = foundProduct.getQuantity() >= productRequest.getQuantity();

        if(!isProductQuantityEnough){
            throw new ProductException("Product Quantity Not Enough");
        }

        customer.getCartItems()
                .add(
                        new CartItem(productRequest.getProductName(),
                         productRequest.getQuantity(),
                         foundProduct.getPrice(),
                         productRequest.getProductCategory()));



        //reduce the product quantity in Shop;

        updateStoreRepository(productIndex, foundProduct, productRequest);

        StoreRepository.getProductCategoryToProductsMap().get(productRequest.getProductCategory()).forEach(System.out::println);
        return "Product added to cart";


        //check of the product exists
    }


    private void updateStoreRepository(int productIndex,Product foundProduct, ProductRequest productRequest){



           StoreRepository.getProductCategoryToProductsMap().get(productRequest.getProductCategory()).remove(foundProduct);

           foundProduct.setQuantity(foundProduct.getQuantity() - productRequest.getQuantity());
           StoreRepository.productCategoryToProductsMap.get(productRequest.getProductCategory()).add(foundProduct);


    }
}
