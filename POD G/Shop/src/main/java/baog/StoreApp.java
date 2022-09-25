package baog;

import baog.enums.Role;
import baog.models.Cashier;
import baog.service.ManagerService;
import baog.service.imp.MangerServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StoreApp {

    private static ManagerService managerService = new MangerServiceImpl();

    public static void main(String[] args) {

        UserDetails cashierDetails = new UserDetailsImpl("firstName",
                "lastName",
                "middleName",
                "email@gmail.com");

        cashierDetails.setRole(Role.CASHIER);

        Cashier cashier = new Cashier(UUID.randomUUID().toString(), cashierDetails);


        String result = managerService.hireCashier(cashier);

        System.out.println(result);




    }
}
