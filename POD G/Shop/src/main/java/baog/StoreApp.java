package baog;

import baog.enums.Role;
import baog.models.Cashier;
import baog.models.Manager;
import baog.service.ManagerService;
import baog.service.imp.MangerServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class StoreApp {

   private final static Executor executor = Executors.newSingleThreadExecutor();

    private final static ManagerService managerService = new MangerServiceImpl();

    public static void main(String[] args) {

        UserDetails cashierDetails = new UserDetailsImpl("firstName",
                "lastName",
                "middleName",
                "email@gmail.com");

        cashierDetails.setRole(Role.CASHIER);
        Cashier cashier = new Cashier(UUID.randomUUID().toString(), cashierDetails);



        UserDetails managerDetails = new UserDetailsImpl("Taiye",
                "Bandipo",
                "Olusayo",
                "bandipotaiye@gmail.com");
        managerDetails.setRole(Role.MANAGER);

        Manager manager = new Manager(UUID.randomUUID().toString(), managerDetails);



            String hireCashierResult = managerService.hireCashier(manager, cashier);

            System.out.println(hireCashierResult);











    }

    private void executeCode(){

    }
}
