package models;

import enums.Gender;

public class PersonDetails {

    private final String firstName;
    private String lastName;
    private String phone;
    private int age;
    private Gender gender;

    protected Address address;



//    public Person() {
//        System.out.println("firstName: "+ firstName);
//        System.out.println("lastName: "+lastName);
//        System.out.println("phone: "+phone);
//        System.out.println("age: "+age);
//        System.out.println("Gender: "+gender);
//
//    }


    public PersonDetails(String firstName, String lastName, String phone, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }


}
