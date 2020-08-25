package com.scscyber.fur.model.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Customer {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Date birthDay;
    private String gender;
    
}
