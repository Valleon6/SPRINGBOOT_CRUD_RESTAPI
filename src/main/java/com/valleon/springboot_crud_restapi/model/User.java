package com.valleon.springboot_crud_restapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Name must not null")
    private String name;

    @NotEmpty(message = "Email must not be null")
    private String email;
    private String mobNo;
    private String password;

    public User() {
    }

    public User(Long id, @NotEmpty(message = "Name must not be null") String name,
                @NotEmpty(message = "Email must not be null") String email, String mobNo, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobNo = mobNo;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
