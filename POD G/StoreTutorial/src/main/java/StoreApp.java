import dtos.ProductRequest;
import enums.Gender;
import enums.ProductCategory;
import enums.Role;
import models.Cashier;
import models.Customer;
import models.Manager;
import models.PersonDetails;
import services.CustomerService;
import services.ManagerService;
import services.impl.CustomerServiceImpl;
import services.impl.ManagerServiceImpl;
import util.FileUtil;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StoreApp {

    private static   ManagerService managerService = new ManagerServiceImpl();
    private static CustomerService customerService = new CustomerServiceImpl();

    public static void main(String[] args) {

        FileUtil.readProductFromCsvFile("/Users/taiye.bandipo/Documents/JavaCore/POD G/StoreTutorial/src/main/resources/products/products.csv");


        String managerId = UUID.randomUUID().toString();

        PersonDetails managerDetails = new PersonDetails("Janet",
                "Kalu",
                "0384038430",
                25,
                Gender.FEMALE,
                Role.MANAGER);

        Manager manager = new Manager(managerId, managerDetails);


        String cashierId = UUID.randomUUID().toString();

        PersonDetails cashierDetails = new PersonDetails("Paul",
                "Olawale",
                "0384038430",
                25,
                Gender.MALE,
                Role.CASHIER);

        Cashier cashier = new Cashier(cashierId, cashierDetails);



        PersonDetails customerDetails = new PersonDetails("Paul",
                "Olawale",
                "0384038430",
                25,
                Gender.MALE,
                Role.CUSTOMER);

        Customer customer = new Customer(UUID.randomUUID().toString(), customerDetails);


        String hiringCashierResult = managerService.hireCashier(manager, cashier);


        System.out.println(hiringCashierResult);


        ProductRequest productRequest = new ProductRequest(ProductCategory.MILK, "Hollandia", 10);

        customerService.addProductToCart(customer, productRequest);

        ProductRequest productRequest2 = new ProductRequest(ProductCategory.JUICE, "FiveAlive", 1);
//
        customerService.addProductToCart(customer, productRequest2);







    }
}
