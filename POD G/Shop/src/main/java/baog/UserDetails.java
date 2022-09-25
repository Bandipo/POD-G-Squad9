package baog;

import baog.enums.Role;

public interface UserDetails {

    String getFirstName();
    String getLastName();
    String getMiddleName();
    String getEmail();
    Role getRole();


     void setFirstName(String firstName);

     void setLastName(String lastName);

     void setMiddleName(String middleName);

     void setRole(Role role);

}
