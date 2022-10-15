package services.impl;

import enums.Gender;
import enums.Role;
import exceptions.ServiceException;
import models.Cashier;
import models.Manager;
import models.PersonDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.ManagerService;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


class ManagerServiceImplTest {

    private String managerId;
    private String cashierId;
    private PersonDetails managerDetails;
    private PersonDetails cashierDetails;

    private Manager manager;
    private Cashier cashier;

    private ManagerService managerService;


    @BeforeEach
    void setUp() {

        managerId = UUID.randomUUID().toString();
        managerDetails = setUpPersonDetails("Mabel", "Smith", "08057848849", 24, Gender.FEMALE, Role.MANAGER);

        manager = new Manager(managerId, managerDetails);

        cashierId = UUID.randomUUID().toString();
        cashierDetails = setUpPersonDetails("Tobi", "Emmanuel", "09083773837", 19, Gender.MALE, Role.CASHIER);

        cashier = new Cashier(cashierId, cashierDetails);

        managerService = new ManagerServiceImpl();
    }

    @Test
    void whenHireCashier_WithValidManagerRole_ShouldPass() {

        String expectedResult = String.format("Cashier with the name %s has been hired", cashier.getPersonDetails().getFullName());
        String actualResult = managerService.hireCashier(manager, cashier);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    void whenHireCashier_WithInvalidManagerRole_ShouldThrowServiceException() {

        manager.getPersonDetails().setRole(Role.CUSTOMER);

        assertThrows(ServiceException.class,
                () -> {
                    managerService.hireCashier(manager, cashier);

                });
    }


    private PersonDetails setUpPersonDetails(String firstName,
                                             String lastName,
                                             String phoneNumber,
                                             int age,
                                             Gender gender,
                                             Role role) {

        return new PersonDetails(firstName, lastName, phoneNumber, age, gender, role);
    }
}