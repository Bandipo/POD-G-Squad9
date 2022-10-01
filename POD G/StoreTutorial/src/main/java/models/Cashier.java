package models;

public class Cashier {

    private String cashierId;
    private PersonDetails personDetails;

    public Cashier(String cashierId, PersonDetails personDetails) {
        this.cashierId = cashierId;
        this.personDetails = personDetails;
    }

    public String getCashierId() {
        return cashierId;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }




    @Override
    public String toString() {
        return "Cashier{" +
                "cashierId='" + cashierId + '\'' +
                ", personDetails=" + personDetails +
                '}';
    }
}
