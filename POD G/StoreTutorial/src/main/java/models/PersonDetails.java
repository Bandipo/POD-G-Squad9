package models;

import enums.Gender;
import enums.Role;

public class PersonDetails {

    private final String firstName;
    private String lastName;
    private String phone;
    private int age;
    private Gender gender;
    private Role role;

    protected Address address;



    public PersonDetails(String firstName, String lastName, String phone, int age, Gender gender, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public Address getAddress() {
        return address;
    }



    public String getFullName(){
        return String.format("%s %s ", firstName, lastName);
    }


    @Override
    public String toString() {
        return "PersonDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}
