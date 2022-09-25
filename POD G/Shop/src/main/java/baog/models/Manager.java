package baog.models;

import baog.UserDetails;

public class Manager {

    private  String managerId;
    private UserDetails userDetails;


    public Manager(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }
}
