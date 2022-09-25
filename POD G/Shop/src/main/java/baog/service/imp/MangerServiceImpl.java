package baog.service.imp;

import baog.Store;
import baog.models.Cashier;
import baog.service.ManagerService;

import java.util.List;

public class MangerServiceImpl implements ManagerService {


    @Override
    public String hireCashier(Cashier cashier) {
        Store.getStoreCashiers().add(cashier);
        return String.format("Cashier with the name %s is hired", cashier.getUserDetails().getFirstName());
    }

    @Override
    public String hireCashiers(List<Cashier> cashierList) {
        return null;
    }
}
