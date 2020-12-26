package com.company.pets.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PETS_USERS")
@Entity(name = "pets_Users")
public class Users extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 1460509443621309890L;

    @NotNull
    @Column(name = "USER_LOGIN", nullable = false, unique = true)
    private String userLogin;

    @NotNull
    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPassword;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}