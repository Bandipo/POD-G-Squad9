package baog.service.imp;

import baog.Store;
import baog.enums.Role;
import baog.exceptions.StoreException;
import baog.models.Cashier;
import baog.models.Manager;
import baog.service.ManagerService;



public class MangerServiceImpl implements ManagerService {


    @Override
    public String hireCashier(Manager manager, Cashier cashier) {

       if(manager == null || cashier == null){
           throw new NullPointerException("Manager or Cashier object cannot be null");
       }

       validateManagerRole(manager.getUserDetails().getRole());

       Store.getStoreCashiers().add(cashier);

        return String.format("Cashier with the name %s is hired", cashier.getUserDetails().getFirstName());
    }



    private void validateManagerRole(Role role){
        final  boolean isManagerRole = Role.MANAGER.equals(role);

        if(!isManagerRole){
            throw new StoreException("You are not authorized to perform this action");
        }
    }
}
