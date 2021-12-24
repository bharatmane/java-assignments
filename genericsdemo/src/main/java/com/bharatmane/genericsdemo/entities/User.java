package com.bharatmane.genericsdemo.entities;
public class User {
    private String fistName;
    private String lastName;
    private Long id;

    public User(Long id) {
        this.id = id;
    }
    public User(String fistName, String lastName, Long id) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.id = id;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof User) {
            User user = (User) object ;
            return this.id.equals(user.getId());
        }
        return false;
    }
}
