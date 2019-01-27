package com.example.jggru.easypill;

/**
 * Created by BenSedacca on 4/16/2018.
 */

public class UserModel {
    private String username, password;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
