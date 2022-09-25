package baog;

import baog.enums.Role;

public class UserDetailsImpl implements UserDetails {
    private String firstName;
    private String lastName;
    private String middleName;
    private final String email;
    private Role role ;

    public UserDetailsImpl(String firstName, String lastName, String middleName, String email) {
        //validate inputs before setting them
        if(firstName.equals(null) || firstName.isEmpty()){
            throw new IllegalArgumentException("firstName must not be null or empty");
        }

        this.firstName = firstName;
        this.lastName = lastName.equals(null) || firstName.isEmpty()? "default Name" : lastName ;
        this.middleName = middleName;
        this.email = email;
    }


    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public Role getRole() {
        return this.role;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public void setRole(Role role) {
        this.role =role;
    }


    @Override
    public String toString() {
        return "UserDetailsImpl{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
