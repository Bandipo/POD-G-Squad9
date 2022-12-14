package models;

import enums.Gender;

public class Manager {

    private String managerId;
    private PersonDetails personDetails;

    public Manager(String managerId, PersonDetails personDetails) {

        this.managerId = managerId;
        this.personDetails = personDetails;


    }

    public String getManagerId() {
        return managerId;
    }


    public PersonDetails getPersonDetails() {
        return personDetails;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", personDetails=" + personDetails +
                '}';
    }
}
