package com.focus.databindingdemo.model;

/**
 * Created by focus on 16/9/22.
 */
public class User {
    private String firstName;
    private String lastName;
    private boolean isVisible;

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisiable(boolean visible) {
        isVisible = visible;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
