package baog.service;

import baog.models.Cashier;
import baog.models.Manager;

import java.util.List;

public interface ManagerService {

    String hireCashier(Manager manager, Cashier cashier);

//    String hireCashiers(Manager manager, List<Cashier> cashierList);
}
