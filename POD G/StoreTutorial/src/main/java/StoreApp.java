import enums.Gender;
import enums.Role;
import models.Cashier;
import models.Manager;
import models.PersonDetails;
import services.ManagerService;
import services.impl.ManagerServiceImpl;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StoreApp {

    private static   ManagerService managerService = new ManagerServiceImpl();

    public static void main(String[] args) {


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



            String hiringCashierResult = managerService.hireCashier(null, cashier);


        System.out.println(hiringCashierResult);


    }
}
