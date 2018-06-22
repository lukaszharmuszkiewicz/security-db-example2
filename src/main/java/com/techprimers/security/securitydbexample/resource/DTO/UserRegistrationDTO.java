package com.techprimers.security.securitydbexample.resource.DTO;

import javax.validation.constraints.NotNull;

/**
 * Created by Lukasz on 17.06.2018.
 */
public class UserRegistrationDTO {

    @NotNull
    private String name;

    @NotNull
    private String username;

    @NotNull
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
