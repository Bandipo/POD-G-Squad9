package models;

public class Address {

    private String streetName;
    private String state;
    private String country;

    public Address(String streetName, String state, String country) {
        this.streetName = streetName;
        this.state = state;
        this.country = country;
    }

    public String getFullAddress(){
        return String.format("%s, %s, %s.", this.streetName, this.state, this.country);
    }

}
