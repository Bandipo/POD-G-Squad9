package services.impl;

import enums.Role;
import exceptions.ServiceException;
import models.Cashier;
import models.Manager;
import services.ManagerService;

public class ManagerServiceImpl implements ManagerService {



    @Override
    public String hireCashier(Manager manager, Cashier cashier)  {
        //validate argument ie. throw exception if manager or cashier is null

        if(manager == null || cashier == null){
            throw new ServiceException("Manager or Cashier cannot be null");
        }

        //validate the role

        if(!Role.MANAGER.equals(manager.getPersonDetails().getRole())){
            throw new ServiceException("You must be a manager to perform this function");
        }



        // hire a cashier

        return String.format("Cashier with the name %s has been hired", cashier.getPersonDetails().getFullName());
    }
}
