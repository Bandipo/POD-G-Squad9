package baog.service;

import baog.models.Cashier;

import java.util.List;

public interface ManagerService {

    String hireCashier(Cashier cashier);

    String hireCashiers(List<Cashier> cashierList);
}
